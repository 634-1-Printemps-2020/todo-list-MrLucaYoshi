package main;

import exception.ExceptionTaches;
import metiers.Taches;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ExceptionTaches, ParseException {
        Taches taches1 = null;
        Taches taches2 = null;
        Taches taches3 = null;
        try{
            SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
            Date date = formatter.parse("12.02.2020");
            Date date2 = formatter.parse("24.05.2020");
            taches1 = new Taches(1,"Luca", "Manger", date, "open", "non");
            System.out.println(taches1);
        } catch (ParseException e){
            e.printStackTrace();
        }
    }
}
