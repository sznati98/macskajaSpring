package hu.szte.prf.prfwebshop.controllers;

import hu.szte.prf.prfwebshop.model.termek.Termek;
import hu.szte.prf.prfwebshop.model.termek.TermekService;
import hu.szte.prf.prfwebshop.model.tranzakcio.Tranzakcio;
import hu.szte.prf.prfwebshop.model.tranzakcio.TranzakcioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class TranzakcioController {

    @Autowired
    TranzakcioService tranzakcioService;

    @Autowired
    TermekService termekService;

    @GetMapping("/")
    public String helloWorld(){
        return "Hello World!";
    }

    @PostMapping(path="/tranzakcio", consumes="application/json")
    public String newTranzakcio(@RequestBody Termek termek){
        try {
            String[] ar = termek.getAr().split(" ");
            Tranzakcio tranzakcio = new Tranzakcio(
                    termek.getId(),
                    new Timestamp(System.currentTimeMillis()),
                    Integer.parseInt(ar[0])
            );

            try{
                this.termekService.getTermekById(tranzakcio.getTermek_id());
                System.out.println("bennevan");
            } catch (Exception e){
                System.out.println("nincsbenne");
                this.termekService.addTermek(termek);
            }
            this.tranzakcioService.addTranzakcio(tranzakcio);
            return "Success";
        } catch (Exception e) {
            System.out.println(e);
            return "Error, check the serve logs";
        }
    }

    @GetMapping("/tranzakciok")
    public List<Tranzakcio> getTranzakciok(){
        try{
            List<Tranzakcio> list = this.tranzakcioService.getAllTranzakcios();
            return list;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    @GetMapping("/tranzakcio")
    public Tranzakcio getTranzakcio(@RequestParam int id){
        try{
            Tranzakcio tranzakcio = this.tranzakcioService.getTranzakcioById(id);
            return tranzakcio;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    @DeleteMapping("/tranzakcio")
    public String deleteTranzakcio(@RequestParam int id){
        try{
            this.tranzakcioService.deleteTranzakcioById(id);
            return "Delete Succes";
        } catch (Exception e) {
            System.out.println(e);
            return "Error, check the serve logs";
        }
    }
}
