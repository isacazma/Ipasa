package Ipas.model;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BoekLes implements Serializable {
    private String datum;
    private PriveLes priveLes;
    private Lid lid;
    private static List<PriveLes> allLessen = new ArrayList<>();

    public BoekLes(String datum, PriveLes priveLes, Lid lid){
        this.datum = datum;
        this.priveLes = priveLes;
        this.lid = lid;

    }

    public void setDatum(String dt) {datum = dt;}

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




    public String getDatum() {return datum;}

    public static List<PriveLes> getBoeklesen() {
        return allLessen;
    }



}

