package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lid implements Serializable {
    private int klant_ID;
    private String voornaam;
    private String achternaam;
    private String email;
    private String telefoonnummer;
    private static List<Lid> alleLeden = new ArrayList<>();

    public Lid(int ID, String vn, String an, String em, String tn){
        klant_ID = ID;
        voornaam = vn;
        achternaam = an;
        email = em;
        telefoonnummer = tn;
        alleLeden.add(this);
    }
    public void setKlant_ID(int ID){klant_ID = ID;}
    public void setVoornaam(String vn){voornaam = vn;}
    public void setAchternaam(String an){achternaam = an;}
    public void setEmail(String em){email = em;}
    public void setTelefoonnummer(String tn){telefoonnummer = tn;}

    public int getKlant_ID() {return klant_ID;}
    public String getVoornaam() {return voornaam;}
    public String getAchternaam() {return achternaam;}
    public String getEmail() {return email;}
    public String getTelefoonnummer() {return telefoonnummer;}

    public static List<Lid> getAllKlanten() {
        return alleLeden;
    }
}