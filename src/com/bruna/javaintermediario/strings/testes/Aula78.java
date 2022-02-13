package com.bruna.javaintermediario.strings.testes;

public class Aula78 {

    public static void main(String[] args) {

        String ola = "Olá";
        String ola2 = "OLÁ";
        String ola3 = "Olá";
        String ola4 = new String(ola);

        //Strings com contéudos diferentes
        System.out.println("ola equals ola2 = " + ola.equals(ola2)); //false

        //Strings com contéudos iguais
        System.out.println("ola equals ola3 = " + ola.equals(ola3)); //true

        //ignora as letras maiúsculas e minúsculas
        System.out.println("ola equals ola2 = " + ola.equalsIgnoreCase(ola2)); //true

        //referências diferentes
        System.out.println("ola == ola2 " + (ola == ola2)); //false

        //refências iguais, pois os contéudos são os mesmos na atribuição simples
        System.out.println("ola == ola3 " + (ola == ola3)); //true

        //refências de objetos diferentes
        System.out.println("ola == ola4 " + (ola == ola4)); //false

        //contéudos são os mesmos
        System.out.println("ola equals ola4 = " + ola.equals(ola4)); //true

        //contéudos são os mesmos
        System.out.println("ola equalsIgnoreCase ola4 = " + ola.equalsIgnoreCase(ola4)); //true

        String banana = "banana";
        String ana = "ana";
        String ban = "ban";

        //compara regiões diferentes das Strings
        System.out.println(banana.regionMatches(1, ana, 0, 3)); //true
        System.out.println(banana.regionMatches(2, ana, 1, 2)); //false

        //igonora caracteres
        System.out.println(banana.regionMatches(true, 0, ban, 0, 3)); //true

        //termina e começa com determinada String
        System.out.println(banana.endsWith(ana)); //true
        System.out.println(banana.startsWith(ban)); //true

        String a = "a";
        String b = "b";
        String aMaiusculo = "A";

        System.out.println(a.compareTo(b)); //-1
        System.out.println(b.compareTo(a)); //1
        System.out.println(a.compareTo("a")); //0
        System.out.println(a.compareTo(aMaiusculo)); //(97 - 65) = 32 - tabela ASCII

        //-1 quando a > b
        //0 quando a == b
        //1 ou >1 quando a<b
    }
}
