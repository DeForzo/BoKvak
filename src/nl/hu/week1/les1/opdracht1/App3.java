package nl.hu.week1.les1.opdracht1;

public class App3 {
    public static void main(String[] args) {
        double f = Math.random()/Math.nextDown(1.0);
        for (int i=1; i<11; i++)
            System.out.println(f);
    }
}
