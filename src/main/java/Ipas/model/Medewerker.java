package Ipas.model;


import java.util.ArrayList;

public class Medewerker extends Acount {

    static int medewerkerAanwezig = 0;

    static ArrayList<String> medewerkers = new ArrayList<>();



    public  Medewerker(String acountNaam, String eMail , String wachtwoord , String rangKeuze, String privateKeyNummer) {

        super(acountNaam, eMail, wachtwoord, rangKeuze, privateKeyNummer);

        this.rangKeuze = "Medewerker";

        medewerkerAanwezig++;

        Medewerker werker = new Medewerker(this.acountNaam,  this.eMail ,  this.wachtwoord ,  this.rangKeuze, this.privateKeyNummer);

        if ( !medewerkers.contains(werker) ){
            medewerkers.add(String.valueOf(werker));


        }}


    public ArrayList<String> getLedden(){
        return medewerkers;
    }



    @Override
    public String getAcountNaam()  {
        return acountNaam;
    }
}