package nl.hu.practica.les4.practicum4;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Huis {
    private String adres;
    private int bouwjaar;
    private String huisbaasnaam;
    private int huisbaasleeftijd;

    public Huis(String adres, int bouwjaar) {
        this.adres = adres;
        this.bouwjaar = bouwjaar;
    }

    public void setHuisbaas(Persoon hb){
        huisbaasnaam = hb.naam;
        huisbaasleeftijd = hb.leeftijd;
    }

    public String getHuisbaas() {
        return huisbaasnaam + "; leeftijd " + huisbaasleeftijd + " jaar";
    }



    @Override
    public String toString(){
        return "Huis " + adres + " is gebouwd in " + bouwjaar + " en heeft huisbaas: " + getHuisbaas();
    }
}
