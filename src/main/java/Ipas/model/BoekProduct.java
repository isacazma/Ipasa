package Ipas.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BoekProduct implements Serializable {
    private int datum;
    private Product product;
    private Lid lid;
    private static List<BoekProduct> allProducten = new ArrayList<>();
// een lijst van geboekte producten

    public BoekProduct(int datum, Product product, Lid lid){
        this.datum = datum;
        this.product = product;
        this.lid = lid;

    }

    public void setDatum(int dt) {datum = dt;}

    public void setProduct(Product pro) {
        this.product = pro;
    }

    public Product getProduct() {
        return product;
    }

    public void setLid(Lid lid) {
        this.lid = lid;
    }

    public Lid getLid() {
        return lid;
    }




    public int getDatum() {
        return datum;}

    public static List<BoekProduct> getProducten() {
        return allProducten;
    }
// om de producten te pakken


}

