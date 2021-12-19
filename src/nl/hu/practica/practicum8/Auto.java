package nl.hu.practica.practicum8;

public class Auto extends Voertuig{
    private String kenteken;

    public Auto(String tp, double np, int jr, String kt) {
        super(tp, np, jr);
        this.kenteken = kt;
    }

    @Override
    public double huidigeWaarde() {
        return 0;
    }
    @Override
    public boolean equals(Object obj){
        return obj==obj;
    }
}
