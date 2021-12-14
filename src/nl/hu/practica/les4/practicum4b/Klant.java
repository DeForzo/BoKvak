package nl.hu.practica.les4.practicum4b;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String naam){
        this.naam = naam;
    }

    public void setKorting(double kortingsPercentage){
        this.kortingsPercentage = kortingsPercentage;
    }

    public double getKorting(){
        return kortingsPercentage;
    }

    public String getNaam(){
        return naam;
    }

    @Override
    public String toString(){
        return "";
    }
}
