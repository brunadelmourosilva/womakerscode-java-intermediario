package com.bruna.javaintermediario.elementos_basicos.garbage_collector;

import com.bruna.javaintermediario.elementos_basicos.valor_referencia.Contato;

public class ColetorLixo {

    public static void main(String[] args) {

        Contato[] contatos = new Contato[1000];

        for (int i = 0; i < contatos.length; i++) {
            contatos[i] = new Contato("Contato" + i, "1234-56789" + i, "contato" + i + "@email.com");
        }

        System.out.println("Contatos criados");

        obterMemoriaUsada();

        contatos = null;

        //garbage collector
        Runtime.getRuntime().runFinalization(); //finalizando o objeto
        Runtime.getRuntime().gc(); //forçando a execução do gc

        System.out.println("Contatos removidos da memória!");

        obterMemoriaUsada();

    }

    //calcular a quantidade de memória gasta: em tempo de execução
    public static void obterMemoriaUsada(){
        final int MB = 1024 * 1024; //bytes para mega

        Runtime runtime = Runtime.getRuntime(); //singleton

        System.out.println("MB = " + (runtime.totalMemory() - runtime.freeMemory()) / MB);
    }
}
