package hu.szte.prf.prfwebshop.model.tranzakcio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TranzakcioServiceImpl implements TranzakcioService{

    @Autowired
    TranzakcioRepository tranzakcioRepository;

    @Override
    public void addTranzakcio(Tranzakcio tranzakcio) {
        this.tranzakcioRepository.save(tranzakcio);
    }

    @Override
    public List<Tranzakcio> getAllTranzakcios() {
        List<Tranzakcio> list = this.tranzakcioRepository.findAll();
        return list;
    }

    @Override
    public Tranzakcio getTranzakcioById(int id) {
        Tranzakcio tranzakcio = this.tranzakcioRepository.findById(id).get();
        return tranzakcio;
    }

    @Override
    public void deleteTranzakcioById(int id) {
        this.tranzakcioRepository.deleteById(id);
    }
}
