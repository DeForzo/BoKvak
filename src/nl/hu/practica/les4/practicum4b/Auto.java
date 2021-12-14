package nl.hu.practica.les4.practicum4b;

public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto(String type, double prijsPerDag){
        this.type = type;
        this.prijsPerDag = prijsPerDag;
    }

    public void setPrijsPerDag(double prijsPerDag){
        this.prijsPerDag = prijsPerDag;
    }

    public double getPrijsPerDag(){
            return prijsPerDag;
        }

    public String getType(){
        return type;
    }

    @Override
    public String toString(){
        return getType() +" met prijs per dag: " + getPrijsPerDag();
    }
}
