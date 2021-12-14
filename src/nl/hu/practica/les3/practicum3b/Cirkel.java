package nl.hu.practica.les3.practicum3b;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int radius, int yPositie, int xPositie){
        this.radius = radius;
        this.xPositie = xPositie;
        this.yPositie = yPositie;
        if (radius <= 0){
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");

        }
    }

    @Override
    public String toString(){
        return "cirkel ("+xPositie+", "+yPositie+") met radius: "+radius;
    }
}
