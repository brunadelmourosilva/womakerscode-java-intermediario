package com.bruna.javaintermediario.elementos_basicos.valor_referencia;

public class Aula61 {

    public static void main(String[] args) {

        //instância de objeto - referência na memória
        Contato contato = new Contato("Contato 1", "1234-4567", "contato1@email.com");
        int valor = 10;

        System.out.println("***** Valores originais");

        System.out.println(contato);
        System.out.println(valor);

        System.out.println("***** Exemplo 1");

        //o contato 2 não sobrescreve o contato 1
        testePassagemValorReferencia(valor, contato);

        System.out.println(contato);
        System.out.println(valor);

        System.out.println("***** Exemplo 2");

        //o atributo nome foi modificado com set
        testePassagemValorReferencia2(valor, contato);

        System.out.println(contato);
        System.out.println(valor);
    }


    private static void testePassagemValorReferencia(int valor, Contato contato){

        int novoValor = valor + 10;
        valor = novoValor;

        contato = new Contato("Contato 2", "2345-6789", "contato2@email.com");
    }

    private static void testePassagemValorReferencia2(int valor, Contato contato){

        int novoValor = valor + 10;

        //modificação da referência no heap de memória
        contato.setNome("Contato"+novoValor);
    }
}
