package hu.szte.prf.prfwebshop.model.tranzakcio;

import java.util.List;

public interface TranzakcioService {
    void addTranzakcio(Tranzakcio tranzakcio);
    List<Tranzakcio> getAllTranzakcios();
    Tranzakcio getTranzakcioById(int id);
    void deleteTranzakcioById(int id);
}
