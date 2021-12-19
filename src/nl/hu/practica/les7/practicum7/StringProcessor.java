package nl.hu.practica.les7.practicum7;

import java.util.ArrayList;

public class StringProcessor {
    ArrayList<OpmaakProces> processen = new ArrayList<OpmaakProces>();

    public StringProcessor(){}

    public String verwerk(String input){
        for (int i = 0; i < processen.size(); i++) {
            input = processen.get(i).maakOp(input);
        }
        return input;
    }

    public void voegProcesToe(OpmaakProces o){
        processen.add(o);
    }

}

