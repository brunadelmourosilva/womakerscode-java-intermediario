package com.bruna.javaintermediario.classes_utilitarias.testes;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Aula91_DateFormat {

    public static void main(String[] args) {

        Date hoje = new Date();

        System.out.println(Locale.getDefault());

        //Date Format
        String hojeFormatado = DateFormat.getInstance().format(hoje);
        System.out.println(hojeFormatado);

        //setando padrão para BR
        Locale.setDefault(new Locale("pt", "Brazil"));

        hojeFormatado = DateFormat.getInstance().format(hoje);
        System.out.println(hojeFormatado);

        System.out.println("--------------------------------------");

        //horário
        hojeFormatado = DateFormat.getTimeInstance().format(hoje);
        System.out.println(hojeFormatado);

        System.out.println("--------------------------------------");

        //data
        hojeFormatado = DateFormat.getDateInstance().format(hoje);
        System.out.println(hojeFormatado); //dd/MMM/yyyy

        System.out.println("--------------------------------------");

        //data e horário
        hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
        System.out.println(hojeFormatado);

        System.out.println("--------------------------------------");

        //constante em hora
        hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
        System.out.println(hojeFormatado);

        //constante em hora
        hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);
        System.out.println(hojeFormatado);

        //constante em hora
        hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
        System.out.println(hojeFormatado);

        System.out.println("--------------------------------------");

        //constante em hora e data
        hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(hoje);
        System.out.println(hojeFormatado);

        System.out.println("--------------------------------------");

        //String em data
        String data = "12-02-2017 14:25";
        try {
            Date dataDate = DateFormat.getInstance().parse(data);
            System.out.println(dataDate);

            Calendar calendario = Calendar.getInstance();
            calendario.setTime(dataDate);

            System.out.println(calendario);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

/*
* String para Date:
* - DateFormat(Locale) ou SimpleDateFormat(especificar o formato da data)
* */
