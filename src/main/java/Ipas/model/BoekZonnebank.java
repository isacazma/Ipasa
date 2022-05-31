package Ipas.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BoekZonnebank implements Serializable {

        private int datum;
        private Zonnebank boekzonnebank;
        private Lid lid;
        private static List<BoekZonnebank> allGeboekteZonnebanken = new ArrayList<>();

        public BoekZonnebank(int datum, Zonnebank zonnebank, Lid lid){
            this.datum = datum;
            this.boekzonnebank = zonnebank;
            this.lid = lid;

        }

        public void setDatum(int dt) {
            datum = dt;}

    public int getDatum() {
        return datum;}

        public void setBoekZonnebank(Zonnebank zon) {
            this.boekzonnebank = zon;
        }

        public Zonnebank getBoekZonnebank() {
            return boekzonnebank;
        }

        public void setLid(Lid lid) {
            this.lid = lid;
        }

        public Lid getLid() {
            return lid;
        }



        public static List<BoekZonnebank> getBoekteZonnebank() {
            return allGeboekteZonnebanken;
        }



    }



