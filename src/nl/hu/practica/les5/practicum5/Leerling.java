package nl.hu.practica.les5.practicum5;

public class Leerling {
    String naam;
    double cijfer;

    public Leerling(String nm){
        naam = nm;
    }

    public String getNaam(){
        return naam;
    }

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }

    public double getCijfer() {
        return cijfer;
    }

    @Override
    public String toString(){
        return naam + " heeft cijfer: " + cijfer;
    }
}
