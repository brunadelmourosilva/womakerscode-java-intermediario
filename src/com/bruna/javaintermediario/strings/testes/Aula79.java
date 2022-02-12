package com.bruna.javaintermediario.strings.testes;

public class Aula79 {

    public static void main(String[] args) {

        String banana = "banana";
        String ana = "ana";

        //indexOf - procura o caracter ou String e retorna seu índice
        System.out.println(banana.indexOf('x'));
        System.out.println(banana.indexOf('b'));
        System.out.println(banana.indexOf('a')); //primeira vez

        System.out.println(banana.indexOf(ana)); //retorna 1

        System.out.println(banana.lastIndexOf('a')); //última vez que o 'a' existe
        System.out.println(banana.lastIndexOf(ana));

        //contais - compara o conteúdo e retorna um booleano
        System.out.println(banana.contains(ana));
        System.out.println(banana.contains("ceu"));
    }
}
