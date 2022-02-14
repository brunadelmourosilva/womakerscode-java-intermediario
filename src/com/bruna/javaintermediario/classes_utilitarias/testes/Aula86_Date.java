package com.bruna.javaintermediario.classes_utilitarias.testes;

import java.util.Date;

public class Aula86_Date {

    public static void main(String[] args) {
        Date hoje = new Date();

        System.out.println(hoje);

        System.out.println("Milisegundos desde 1 Jan 1970 " + hoje.getTime());

        System.out.println("Dia do mês: " + hoje.getDate());
    }
}
