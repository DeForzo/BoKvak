package nl.hu.practica.les6.practicum6;
import java.time.LocalDate;

import static java.lang.System.*;

public class Game {
    String naam;
    int releaseJaar;
    double nieuwprijs;

    public Game(String naam, int releaseJaar, double nieuwprijs){
      this.naam = naam;
      this.releaseJaar = releaseJaar;
      this.nieuwprijs = nieuwprijs;
    }

    public String getNaam(){
        return naam;
    }

    public double huidigeWaarde() {
        double nieuweWaarde = nieuwprijs;
        int jaar = LocalDate.now().getYear();
        int verschil = jaar - releaseJaar;

        if (verschil != 0) {
            for(int i = 0; i < verschil; i++) {
                nieuweWaarde = nieuweWaarde * 0.7;
            }
        }
        return nieuweWaarde;
    }


    @Override
    public String toString(){
        return naam + ", uitgegeven in " + releaseJaar + "; nieuwprijs: €" + nieuwprijs + " nu voor: €" + huidigeWaarde();
    }
}
