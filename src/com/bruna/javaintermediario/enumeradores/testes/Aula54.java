package com.bruna.javaintermediario.enumeradores.testes;

import com.bruna.javaintermediario.enumeradores.classes.Data;
import com.bruna.javaintermediario.enumeradores.classes.DiaSemana;
import com.bruna.javaintermediario.enumeradores.classes.DiasDaSemanaConstantes;

public class Aula54 {

    public static void main(String[] args) {

        DiaSemana dia = DiaSemana.SEGUNDA;

        System.out.println(dia);


        Data data = new Data(1, 4, 2022, DiaSemana.SEGUNDA);

        System.out.println(data);
    }
}
