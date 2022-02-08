package com.bruna.javaintermediario.enumeradores.testes;

import com.bruna.javaintermediario.enumeradores.classes.DiaSemana;
import com.bruna.javaintermediario.enumeradores.classes.DiasDaSemanaConstantes;

public class Aula53 {

    public static void main(String[] args) {

        //utilizando constantes
        constantes();

        //utilizando enums
        utilizandoEnum();
    }

    private static void constantes() {

        int segunda = DiasDaSemanaConstantes.SEGUNDA;
        int terca = DiasDaSemanaConstantes.TERCA;
        int quarta = DiasDaSemanaConstantes.QUARTA;
        int quinta = DiasDaSemanaConstantes.QUINTA;
        int sexta = DiasDaSemanaConstantes.SEXTA;
        int sabado = DiasDaSemanaConstantes.SABADO;
        int domingo = DiasDaSemanaConstantes.DOMINGO;

        System.out.println("Teste utilizando constantes no Java");
        imprimeDiasSemana(segunda);
        imprimeDiasSemana(terca);
        imprimeDiasSemana(quarta);
        imprimeDiasSemana(quinta);
        imprimeDiasSemana(sexta);
        imprimeDiasSemana(sabado);
        imprimeDiasSemana(domingo);
    }

    private static void utilizandoEnum(){

        DiaSemana segunda = DiaSemana.SEGUNDA;
        DiaSemana terca = DiaSemana.TERCA;
        DiaSemana quarta = DiaSemana.QUARTA;
        DiaSemana quinta = DiaSemana.QUINTA;
        DiaSemana sexta = DiaSemana.SEXTA;
        DiaSemana sabado = DiaSemana.SABADO;
        DiaSemana domingo = DiaSemana.DOMINGO;

        System.out.println("Teste utilizando enum no Java");
        imprimeDiasSemana(segunda);
        imprimeDiasSemana(terca);
        imprimeDiasSemana(quarta);
        imprimeDiasSemana(quinta);
        imprimeDiasSemana(sexta);
        imprimeDiasSemana(sabado);
        imprimeDiasSemana(domingo);
    }

    public static void imprimeDiasSemana(DiaSemana dia) {
        switch (dia) {
            case SEGUNDA:
                System.out.println("Segunda-feira");
                break;
            case TERCA:
                System.out.println("Terça-feira");
                break;
            case QUARTA:
                System.out.println("Quarta-feira");
                break;
            case QUINTA:
                System.out.println("Quinta-feira");
                break;
            case SEXTA:
                System.out.println("Sexta-feira");
                break;
            case SABADO:
                System.out.println("Sábado");
                break;
            case DOMINGO:
                System.out.println("Domingo");
                break;
        }
    }


    public static void imprimeDiasSemana(int dia) {
        switch (dia) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
    }
}
