package nl.hu.week1.les2.practicum2;

public class Zwembad {
    double Breedte;
    double Lengte;
    double Diepte;
    double inh;

    Zwembad(double Breedte, double Lengte, double Diepte){
        this.Breedte = Breedte;
        this.Lengte = Lengte;
        this.Diepte = Diepte;
    }
    Zwembad(){}
    public void setBreedte(double Breedte) {
        this.Breedte = Breedte;
    }
    public void setLengte(double Lengte) {
        this.Lengte = Lengte;
    }
    public void setDiepte(double Diepte){
        this.Diepte = Diepte;
    }
    public double getBreedte() {
        return Breedte;
    }
    public double getLengte() {
        return Lengte;
    }
    public double getDiepte(){
        return Diepte;
    }

    public double inhoud() {
        return Diepte * Lengte * Breedte;
    }
}