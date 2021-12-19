package nl.hu.practica.practicum8;

public class Fiets extends Voertuig {
    private int framenummer;

    public Fiets(String tp, double np, int jr, int fnr) {
        super(tp, np, jr);
        this.framenummer = fnr;
    }

    @Override
    public double huidigeWaarde() {
        return 0;
    }

    public boolean equals(Object obj){
        return obj==obj;
    }


}
