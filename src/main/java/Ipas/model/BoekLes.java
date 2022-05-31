package Ipas.model;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BoekLes implements Serializable {
    private int datum;
    private PriveLes priveLes;
    private Lid lid;
    private static List<BoekLes> allLessen = new ArrayList<>(); //lessen die geboekt zijn

    public BoekLes(int datum, PriveLes priveLes, Lid lid){
        this.datum = datum;
        this.priveLes = priveLes;
        this.lid = lid;

    }

    public void setDatum(int dt) {
        datum = dt;}

    public void setPriveLes(PriveLes les) {
        this.priveLes = les;
    }

    public PriveLes getPriveLes() {
        return priveLes;
    }

    public void setLid(Lid lid) {
        this.lid = lid;
    }

    public Lid getLid() {
        return lid;
    }

    public void  addBoeklessen(BoekLes priveBoeking){
        allLessen.add(priveBoeking);
    }

    public int getDatum() {
        return datum;}

    public static List<BoekLes> getBoeklesen() {
        return allLessen;
    }
    // om geboekte lessen te pakken


}

