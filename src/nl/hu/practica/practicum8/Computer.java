package nl.hu.practica.practicum8;

public class Computer implements Goed {
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp, String adr, double pr, int jr){
        this.type = tp;
        this.macAdres = adr;
        this.aanschafPrijs = pr;
        this.productieJaar = jr;
    }

    @Override
    public double huidigeWaarde() {
        return 0;
    }

    @Override
    public boolean equals(Object obj){
        return obj==obj;
    }
    @Override
    public String toString(){
        return null;
    }



}
