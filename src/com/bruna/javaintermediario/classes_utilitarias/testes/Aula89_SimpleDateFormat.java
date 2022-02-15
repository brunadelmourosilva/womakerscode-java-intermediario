package com.bruna.javaintermediario.classes_utilitarias.testes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula89_SimpleDateFormat {

    public static void main(String[] args) {

        //https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");

        Calendar data = new GregorianCalendar(2010, 5, 4, 14, 32, 25);

        System.out.println(sdf.format(data.getTime()));

        System.out.println("------------------------");

        Date hoje = new Date();

        System.out.println(sdf.format(hoje));

        System.out.println("------------------------");

        String d = sdf.format(hoje);

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        String minhaData = "20/02/2000";

        try {
            Date minhaDataEmDate = sdf1.parse(minhaData); //transformando um tipo String para data

            System.out.println(minhaDataEmDate);

            System.out.println(sdf.format(minhaDataEmDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


}
