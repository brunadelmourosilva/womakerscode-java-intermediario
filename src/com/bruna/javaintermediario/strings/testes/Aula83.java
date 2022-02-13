package com.bruna.javaintermediario.strings.testes;

public class Aula83 {

    public static void main(String[] args) {

        String[] letras = {"B", "C", "D", "E", "F"};

        String alfabeto = "";

        //impacto na performace do código
        for (String letra : letras){
            alfabeto += letra;
        }

        System.out.println(alfabeto);

        //StringBuffer - coleção de strings
        StringBuffer sb = new StringBuffer();
        for (String letra : letras){
            sb.append(letra); //adição de strings em sb
        }
        alfabeto = sb.toString();

        System.out.println(alfabeto);

        System.out.println("--------------------");

        //String inversa com StringBuffer
        System.out.println(sb.reverse());

        System.out.println("--------------------");

        //StringBuilder - coleção de strings
        StringBuilder sb_ = new StringBuilder();
        for (String letra : letras){
            sb_.append(letra);
        }
        alfabeto = sb_.toString();

        System.out.println(alfabeto);
    }

    //Diferença entre as duas classes
    //StringBuffer: Thread safe(se estiver trabalhando com threads)
    //StringBuilder: não é Thread safe
}
