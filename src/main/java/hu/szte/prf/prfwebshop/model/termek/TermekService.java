package hu.szte.prf.prfwebshop.model.termek;

import java.util.List;

public interface TermekService {
    void addTermek(Termek termek);
    List<Termek> getAllTermek();
    Termek getTermekById(String id);
    void deleteTermek(String id);
}
