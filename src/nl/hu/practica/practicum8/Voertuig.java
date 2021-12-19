package nl.hu.practica.practicum8;

public abstract class Voertuig implements Goed {
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String tp, double np, int jr){}

    @Override
    public boolean equals(Object obj){
        return false;
    }

    @Override
    public String toString() {
        return null;
    }
}
