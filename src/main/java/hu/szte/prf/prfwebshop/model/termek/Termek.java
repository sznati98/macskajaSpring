package hu.szte.prf.prfwebshop.model.termek;

import javax.persistence.*;

@Entity
@Table(name="termek")
public class Termek {

    @Id
    private String id;
    private String ar;
    private String leiras;

    public Termek() {
    }

    public Termek(String id, String ar, String leiras) {
        this.id = id;
        this.ar = ar;
        this.leiras = leiras;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAr() {
        return ar;
    }

    public void setAr(String ar) {
        this.ar = ar;
    }

    public String getLeiras() {
        return leiras;
    }

    public void setLeiras(String leiras) {
        this.leiras = leiras;
    }

    @Override
    public String toString() {
        return "Termek{" +
                "id='" + id + '\'' +
                ", ar='" + ar + '\'' +
                ", leiras='" + leiras + '\'' +
                '}';
    }
}
