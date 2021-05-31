package hu.szte.prf.prfwebshop.model.termek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TermekServiceImpl implements TermekService{

    @Autowired
    TermekRepository termekRepository;

    @Override
    public void addTermek(Termek termek) {
        this.termekRepository.save(termek);
    }

    @Override
    public List<Termek> getAllTermek() {
        List<Termek> list = this.termekRepository.findAll();
        return list;
    }

    @Override
    public Termek getTermekById(String id) {
        Termek termek = this.termekRepository.findById(id).get();
        return termek;
    }

    @Override
    public void deleteTermek(String id) {
        this.termekRepository.deleteById(id);
    }
}
