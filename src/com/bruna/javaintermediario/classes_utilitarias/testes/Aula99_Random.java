package com.bruna.javaintermediario.classes_utilitarias.testes;

import java.util.Random;

public class Aula99_Random {

    public static void main(String[] args) {

        System.out.println(Math.floor(Math.random() * 100)); //número de 0 a 100

        Random numAleatorio = new Random();

        System.out.println(numAleatorio.nextInt());

        System.out.println(numAleatorio.nextInt(5 + 1)); // com limite entre 0 e 5
    }
}
