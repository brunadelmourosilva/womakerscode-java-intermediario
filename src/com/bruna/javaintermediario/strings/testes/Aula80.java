package com.bruna.javaintermediario.strings.testes;

public class Aula80 {

    public static void main(String[] args) {

        String teste = "Isso é um teste.";

        //substring
        System.out.println(teste);
        System.out.println(teste.substring(10)); //inicia a partir do índice 10
        System.out.println(teste.substring(10, 15)); //irá do índice 10 até 15

        //concat
        String ola = "olá";
        String mundo = " mundo";
        String olaMundo = ola.concat(mundo); //ola + mundo
        System.out.println(olaMundo);

        //replace
        String espacos = "i s p a ç o";
        String semEspacos = espacos.replace('i', 'e');
        System.out.println(semEspacos);

        //replaceAll
        semEspacos = semEspacos.replaceAll(" ", "");
        System.out.println(semEspacos);

        //trim
        String nome = " meu nome é: ";
        System.out.println(nome);
        System.out.println(nome.trim());

        //web services
        //XML
        //CSV - substring e trim
    }
}
