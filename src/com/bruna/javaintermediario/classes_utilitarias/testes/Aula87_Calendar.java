package com.bruna.javaintermediario.classes_utilitarias.testes;

import java.util.Calendar;

public class Aula87_Calendar {

    public static void main(String[] args) {


        //padrão de prjeto - singleton
        //sem instanciação
        Calendar hoje = Calendar.getInstance();

        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH); //mês começa em 0
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int hora = hoje.get(Calendar.HOUR_OF_DAY);
        int minutos = hoje.get(Calendar.MINUTE);
        int segundos = hoje.get(Calendar.SECOND);

        System.out.printf("Hoje é : %02d/%02d/%d %02d:%02d:%02d",
                dia, (mes+1), ano, hora, minutos, segundos);

        //menos 1 dia
        hoje.add(Calendar.DAY_OF_MONTH, -1);

        //adiciona 6 dias
        hoje.add(Calendar.DAY_OF_MONTH, 6);

        System.out.println();

        System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
    }
}
