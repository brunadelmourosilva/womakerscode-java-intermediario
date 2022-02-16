package com.bruna.javaintermediario.classes_utilitarias.testes;

import java.text.NumberFormat;
import java.util.Locale;

public class Aula90_Locale {

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();

        //configuração padrão do PC
        System.out.println(locale);

        Locale[] locales = Locale.getAvailableLocales();
        for (Locale loc: locales){

            System.out.println("Nome: " + loc.getDisplayName());
            System.out.println("Código da língua: " + loc.getLanguage());
            System.out.println("Língua: " + loc.getDisplayLanguage());
            System.out.println("Cod País: " + loc.getCountry());
            System.out.println("País: " + loc.getDisplayCountry());

            System.out.println("*******************");

        }

        Locale br = new Locale("pt", "Brazil");

        //com construtor
        System.out.println(br);

        //setando locale padrão
        Locale.setDefault(br);
        System.out.println(Locale.getDefault());

        System.out.println("------------------------------");

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(5000000000d));

        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf1.format(5000000000d));

        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.ITALY);
        System.out.println(nf2.format(5000000000d));

        //Brasil
        NumberFormat nf3 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        System.out.println(nf3.format(5000000000d));

    }
}
