package Ipas.model;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PriveLes implements Serializable {
    private String trainer;
    private Double prijs;
    private String title;
    private String beschrijving;
    private static List<PriveLes> allePriveLessen = new ArrayList<>();


    public PriveLes(String trainer, Double prijs, String title,String beschrijving){
        this.trainer = trainer;
        this.prijs = prijs;
        this.title = title;
        this.beschrijving = beschrijving;
        allePriveLessen.add(this);
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public void setPrijs(Double prijs) {
        this.prijs = prijs;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public String getTrainer() {
        return trainer;
    }

    public String getTitle() {
        return title;}

    public Double getPrijs() {
        return prijs;}

    public String getBeschrijving() {
        return beschrijving;}


    public static List<PriveLes> getAllePriveLessen() {
        return allePriveLessen;
    }







}
