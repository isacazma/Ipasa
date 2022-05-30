package Ipas.model;

import java.util.ArrayList;

public class Acount {
// Dit zijn de inlog gegevens die er voor zorgen wat de rang van de Acount gaat zijn

    protected String acountNaam;

    protected String eMail;

    protected String wachtwoord;

    protected String rangKeuze;

    protected String privateKeyNummer;

    protected ArrayList<Acount> gebruikserLijst = new ArrayList<>();



public Acount(String acountNaam, String eMail , String wachtwoord , String rangKeuze, String privateKeyNummer){
    this.acountNaam = acountNaam;

    this.eMail = eMail;

    this.wachtwoord = wachtwoord;

    this.rangKeuze = rangKeuze ;

    this.privateKeyNummer = privateKeyNummer;


}
// geter van de klasse
    public String getAcountNaam() {
        return acountNaam;
    }

    public String geteMail() {
        return eMail;
    }

    public String getPrivateKeyNummer() {
        return privateKeyNummer;
    }

    public String getRangKeuze() {
        return rangKeuze;
    }



    public String getWachtwoord() {
        return wachtwoord;
    }
// lijst met Acounts

    public  ArrayList<Acount> GetgebruikserLijst() {
        return gebruikserLijst;
    }


// kijken of het gelijk is
    public boolean gelijkGegevens(Object obj){
        boolean goed = false;
        if(obj instanceof Acount){
            Acount andere = (Acount) obj;

            if(this.acountNaam.equals(andere.getAcountNaam()) &&
                    this.privateKeyNummer.equals(andere.getPrivateKeyNummer()) &&
                    this.eMail.equals(andere.geteMail()) &&
                    this.rangKeuze.equals(andere.getRangKeuze()) &&
                    this.wachtwoord.equals(andere.getWachtwoord())) {

                goed = true;

            }

        }
        return goed;

    }






}
