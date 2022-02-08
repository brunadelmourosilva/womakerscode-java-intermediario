package com.bruna.javaintermediario.enumeradores.testes;

import com.bruna.javaintermediario.enumeradores.classes.Data;
import com.bruna.javaintermediario.enumeradores.classes.DiaSemana;

public class Aula55 {

    public static void main(String[] args) {

        //values: retorna uma array com todos os valores do enum
        DiaSemana[] dias = DiaSemana.values();

        for (DiaSemana x : dias) {
            System.out.println(x);
        }

        System.out.println("------------------------");

        //valueOf: retorna um enum específico
        DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");

        System.out.println(dia);
    }
}
