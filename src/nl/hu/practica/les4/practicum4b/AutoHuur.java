package nl.hu.practica.les4.practicum4b;

public class AutoHuur {
    private int aantalDagen;
    private Auto auto;
    private Klant klant;

    public AutoHuur(){}

    public void setAantalDagen(int aantalDagen){
        this.aantalDagen = aantalDagen;
    }

    public int getAantalDagen(){
        return aantalDagen;
    }

    public void setGehuurdeAuto(Auto auto){
        this.auto = auto;
    }

    public String getGehuurdeAuto(){
        return String.valueOf(auto);
    }

    public void setHuurder(Klant klant){
        this.klant = klant;
    }

    public double totaalPrijs(){
        return (auto.getPrijsPerDag() - (auto.getPrijsPerDag()) / klant.getKorting()) * aantalDagen;
    }


    @Override
    public String toString() {
        String s = """
                er is geen auto bekend
                er is geen huurder bekend
                aantal dagen: 0 en dat kost 0.0""";

        if (auto == null && klant == null) {
            return s;
        } else if (auto == null && !(klant == null)) {
            return "er is geen auto bekend\nop naam van: "+klant.getNaam()+" (korting: "+klant.getKorting()+"%)\naantal dagen: 0 en dat kost 0.0";
            } else if (!(auto == null) && klant == null){
            return "autotype: "+auto.getType()+" met prijs per dag: "+auto.getPrijsPerDag()+"\ner is geen huurder bekend\naantal dagen: 0 en dat kost 0.0";
        }
        return "autotype: "+auto.getType()+" met prijs per dag: "+auto.getPrijsPerDag()+"\n" +
                "op naam van: "+klant.getNaam()+" (korting: "+klant.getKorting()+"%)\n" +
                "aantal dagen: "+getAantalDagen()+" en dat kost "+totaalPrijs();
    }
}


