package nl.hu.practica.les6.practicum6;

import java.util.ArrayList;

public class Persoon{
    String naam;
    double budget;
    ArrayList<Game> games = new ArrayList<>();


    public Persoon(String naam, double budget){
        this.naam = naam;
        this.budget = budget;
    }

    public double getBudget(){
        return budget;
    }

    public boolean koop(Game g) {
        boolean success = false;
        if(!games.contains(g)) {
            if(budget - g.huidigeWaarde() > 0) {
                games.add(g);
                budget = budget - g.huidigeWaarde();
                success = true;
            }
        }
        return success;
    }


    public boolean verkoop(Game g, Persoon koper) {
        boolean success = false;
        if(koper.games.contains(g)) {
            success = false;
        } else {
            if(koper.getBudget() > g.huidigeWaarde()) {
                koper.games.add(g);
                koper.budget = koper.budget - g.huidigeWaarde();
                budget = budget + g.huidigeWaarde();
                success = true;
            }
        }
        return success;
    }

    @Override
    public String toString(){
        String s = naam + " heeft een budget van €" + getBudget() + " en bezit de volgende games: \n";
        for (Game game : games) {
            s = s + game + "\n";
        }
        return s;
    }

    public boolean equals(Object o, Object a){
        return o != a;
    }
}
