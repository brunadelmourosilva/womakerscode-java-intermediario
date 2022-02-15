package com.bruna.javaintermediario.classes_utilitarias.testes;

/*
* projeto criado com ResourceBundle: https://github.com/brunadelmourosilva/resourceBundle-interfaces
* */


import java.util.Locale;
import java.util.ResourceBundle;

public class Aula95_ResourceBundle {

    public static void main(String[] args) {

        System.out.println("Locale atual " + Locale.getDefault());

        ResourceBundle rb = ResourceBundle.getBundle("meu-texto");

        System.out.println("Hello EN: " + rb.getString("hello"));
        System.out.println("World EN: " + rb.getString("world"));

        // Locale.setDefault(new Locale("pt_BR", "pt_BR"));
        rb = ResourceBundle.getBundle("meu-texto", new Locale("pt_BR", "pt_BR"));

        System.out.println("Olá pt_BR: " + rb.getString("hello"));
        System.out.println("Mundo pt_BR: " + rb.getString("world"));
    }
}
