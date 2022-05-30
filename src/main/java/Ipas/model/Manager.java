package Ipas.model;

import Ipas.model.Acount;

public class Manager extends Acount {
    public Manager(String acountNaam, String eMail , String wachtwoord , String rangKeuze, String privateKeyNummer){
        super(acountNaam,eMail,wachtwoord,rangKeuze,privateKeyNummer);
        this.rangKeuze ="Manager";


    }

    @Override
    public String getAcountNaam()  {
        return acountNaam;
    }
}
