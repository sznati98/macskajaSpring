package hu.szte.prf.prfwebshop.model.tranzakcio;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tranzakcio")
public class Tranzakcio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String termek_id;
    private Timestamp datum;
    private int osszeg;

    public Tranzakcio() {
    }

    public Tranzakcio(String termek_id, Timestamp datum, int osszeg) {
        this.termek_id = termek_id;
        this.datum = datum;
        this.osszeg = osszeg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTermek_id() {
        return termek_id;
    }

    public void setTermek_id(String termek_id) {
        this.termek_id = termek_id;
    }

    public Timestamp getDatum() {
        return datum;
    }

    public void setDatum(Timestamp datum) {
        this.datum = datum;
    }

    public int getOsszeg() {
        return osszeg;
    }

    public void setOsszeg(int osszeg) {
        this.osszeg = osszeg;
    }

    @Override
    public String toString() {
        return "Tranzakcio{" +
                "id=" + id +
                ", termek_id='" + termek_id + '\'' +
                ", datum=" + datum +
                ", osszeg=" + osszeg +
                '}';
    }
}
