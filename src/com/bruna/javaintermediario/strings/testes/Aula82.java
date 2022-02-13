package com.bruna.javaintermediario.strings.testes;

import com.bruna.javaintermediario.strings.classes.Pessoa;

public class Aula82 {

    public static void main(String[] args) {

        //join - unir strings através de um delimitador
        String alfabeto = String.join(", ", "A", "B", "C", "D"); //parâmetros varargs
        System.out.println(alfabeto);

        //split - separar strings por um regex
        String[] letras = alfabeto.split(", ");
        for (String letra : letras){
            System.out.println(letra);
        }


        String doArquivo = "1;Antônio;30;";
        String[] infos = doArquivo.split(";");

        Pessoa pessoa = new Pessoa(Integer.parseInt(infos[0]), infos[1], Integer.parseInt(infos[2]));
        System.out.println(pessoa);
    }
}
