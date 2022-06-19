package model;




import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Product implements Serializable {
    private String productNaam;
    private int productNr;
    private String beschrijving;
    private static List<Product> producten = new ArrayList<>();


    public Product(String product, Double prijs, int productNr, String beschrijving){
        this.productNaam = product;

        this.productNr = productNr;
        this.beschrijving = beschrijving;
        producten.add(this);
    }

    public void setProductNaam(String productNaam) {
        this.productNaam = productNaam;
    }



    public void setProductNr(int productNr) {
        this.productNr = productNr;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public String getProductNaam() {
        return productNaam;
    }

    public int getProductNr() {
        return productNr;}



    public String getBeschrijving() {
        return beschrijving;}


    public static List<Product> getProducten() {
        return producten;
    }






}
