package nl.hu.practica.les5.practicum5;
import java.util.ArrayList;
import java.util.Iterator;


public class Klas {
    private String klasCode;
    Leerling leerling;
    ArrayList<Leerling> L = new ArrayList<>();

    public Klas(String kC) {
        klasCode = kC;
    }

    public void voegLeerlingToe(Leerling l){
        leerling = l;
        L.add(l);
    }

    public void wijzigCijfer(String nm, double newCijfer) {
        for (Leerling leerling : L) {
            if (leerling.naam.equals(nm)) {
                leerling.setCijfer(newCijfer);
            };
        }
    }


    public ArrayList<Leerling> getLeerlingen(){
        return L;
    }

    public int aantalLeerlingen(){
        return L.size();
    }

    @Override
    public String toString(){
        String s = "In klas "+klasCode+" zitten de volgende leerlingen:\n";
        for (Leerling leerling : L) {
            s = s + leerling + "\n";
        }
        return s;
    }
}

//In klas V1Z zitten de volgende leerlingen:
//Hans heeft cijfer: 0.0
//Jan heeft cijfer: 0.0
//Wim heeft cijfer: 0.0