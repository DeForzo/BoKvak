package nl.hu.practica.les7.practicum7;

public class VervangProces implements OpmaakProces {
    private String oud;
    private String nieuw;

    public VervangProces(String oud, String nieuw){
        this.oud = oud;
        this.nieuw = nieuw;
    }

    public String maakOp(String input){
        String a = input.replaceAll(oud, nieuw);
        return a;
    }
}
