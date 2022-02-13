package com.bruna.javaintermediario.strings.testes;

import java.util.Arrays;

public class Aula77 {

    public static void main(String[] args) {

        String extraindoChars = "Curso de Java";

        //acessando cada caracter da String
        for (int i = 0; i < extraindoChars.length(); i++){
            System.out.print(extraindoChars.charAt(i) + " ");
        }
        System.out.println("\n-------------------");

        //extraindo caracteres da String e atribuindo-as à um array
        char[] extraindo = new char[3];
        extraindoChars.getChars(0, 3, extraindo, 0);
        System.out.println(extraindo);

        System.out.println("-------------------");

        //formato bytes - tabela ASCII
        byte[] javBytes = new byte[3];
        extraindoChars.getBytes(0, 3, javBytes, 0);
        System.out.println(Arrays.toString(javBytes));

        System.out.println("-------------------");

        //transformar chars em String
        char[] javaChars = extraindoChars.toCharArray();
        System.out.println(javaChars);
    }
}
