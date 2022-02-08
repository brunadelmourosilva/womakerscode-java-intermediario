package com.bruna.javaintermediario.enumeradores.exercicios;


/*
 * Exercício: calculadora com Enum
 */


public class Calculadora {

    public static final Integer X = 10;
    public static final Integer Y = 8;

    public static void main(String[] args) {

        Operacoes[] operacoes = Operacoes.values();

        for (Operacoes op : operacoes) {
            //System.out.print(op + " = ");

            System.out.print(X + " " + op + " " + Y + " = ");

            System.out.println(op.executarOperacao(X, Y));
        }
    }
}
