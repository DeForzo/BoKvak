package nl.hu.practica.les3.practicum3b;

public class Main {
    public static void main(String[] args) {
        Cirkel c1 = null, c2 = null;

        try {
            c1 = new Cirkel(10, 0, 0);
            c2 = new Cirkel(0, 10, 10);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        System.out.println(c1);
        System.out.println(c2);
    }
}
 // Ik denk dat de applicatie niet meer werkt als ik de try-catch blok weghaal, en dat er een Exception wordt gegeven. Op dit moment catch ik als het ware de Exception en laat ik de app doorgaan, als ik de blok eruithaal stopt de applicatie dus met werken
// Klopt
