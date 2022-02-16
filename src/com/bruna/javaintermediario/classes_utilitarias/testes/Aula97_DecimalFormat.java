package com.bruna.javaintermediario.classes_utilitarias.testes;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

//https://docs.oracle.com/javase/8/docs/api/java/text/DecimalFormat.html

public class Aula97_DecimalFormat {

    public static void main(String[] args) {

        String padrao = "###,###.##";
        DecimalFormat df = new DecimalFormat(padrao);

        // df.applyPattern(padrao);
        System.out.println(df.format(1234567890.123)); //american pattern

        System.out.println("-------------------------------");

        DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
        dfs.setDecimalSeparator(',');
        dfs.setGroupingSeparator('.');

        String padrao2 = "###,###.##";
        df = new DecimalFormat(padrao2, dfs);
        System.out.println(df.format(1234567890.123)); //brazilian pattern

        System.out.println("-------------------------------");

        String padrao3 = "###,###,###.##";
        df = new DecimalFormat(padrao3, dfs);
        df.setGroupingSize(4);
        System.out.println(df.format(1234567890.123));

        System.out.println("-------------------------------");

        String padrao4 = "\u00A4###,###,000.00%"; // \u00A4 -> monetary value
        df = new DecimalFormat(padrao4, dfs);
        System.out.println(df.format(0.1));
    }
}
