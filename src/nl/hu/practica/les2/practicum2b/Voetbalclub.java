package nl.hu.practica.les2.practicum2b;

public class Voetbalclub {
    String naam;
    int aantalGewonnen;
    int aantalGelijk;
    int aantalVerloren;

    Voetbalclub(String naam){
        this.naam = naam;
        int aantalGewonnen = this.aantalGewonnen;
    };
    Voetbalclub(){
        this.naam = "FC";
    }

    //aantal gespeelde wedstrijden
    public int aantalGespeeld() {
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    //aantal punten behaald (winst = 3, gelijk = 1)
    public int aantalPunten(){
        return aantalGewonnen * 3 + aantalGelijk;
    }

    // resultaat verwerken na iedere gespeelde wedstrijd
    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s", naam, this.aantalGespeeld(), aantalGewonnen, aantalGelijk, aantalVerloren, aantalPunten());
    }
}
