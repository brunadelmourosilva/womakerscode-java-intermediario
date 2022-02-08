package com.bruna.javaintermediario.elementos_basicos.printf;

public class Aula63 {

    public static void main(String[] args) {

        //String
        System.out.printf("%s", "Olá, Mundo!");
        System.out.println();
        System.out.printf("%S", "Olá, Mundo!");
        System.out.println();

        //char
        System.out.printf("%c", 'c');
        System.out.println();
        System.out.printf("%C", 'c');

        //pulando linha sem \n
        System.out.printf("%n");

        //num. inteiro
        int valor = 123456789;
        System.out.printf("%d", valor);

        System.out.println();

        //num. decimal de pf
        double pontoFlutuante = 3.1456789;
        System.out.printf("%f", pontoFlutuante);

        System.out.println();

        //alinhamento à direita
        String olaMundo = "Olá, Mundo!";
        System.out.printf("%20s", olaMundo);

        System.out.println();

        //alinhamento à esquerda
        System.out.printf("%-20s", olaMundo);

        System.out.println();

        //num. positivo
        System.out.printf("%+d", valor);

        System.out.println();

        //formatação de casas
        System.out.printf("%015d", valor);

        System.out.println();

        //separa as casas do num.
        System.out.printf("%,d", valor);

        System.out.println();

        int valor2 = -123456789;

        //insere o sinal negativo
        System.out.printf("% d", valor2);
        System.out.println();
        System.out.printf("% d", valor);

        System.out.println();

        //formatação de casas
        System.out.printf("%.3f", pontoFlutuante);

        System.out.println();

        //formatação de casas
        System.out.printf("R$%10.2f", pontoFlutuante);

        System.out.println();

        teste();

    }

    private static void teste(){

        double[] precos = {10000, 123.54, 7843.567, 1, 4.56789};

        for (int i=0; i<precos.length; i++){
            //string
            // inteiro com 0 na frente e mantendo somente duas casas
            // separa por vírgula, alinha com 10 espaços e formta com duas casas
            System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);
        }

        //Java.util.Formater
    }
}
