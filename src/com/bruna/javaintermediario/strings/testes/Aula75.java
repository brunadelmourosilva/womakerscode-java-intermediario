package com.bruna.javaintermediario.strings.testes;

public class Aula75 {

    public static void main(String[] args) {


        String novaStringVazia = new String();
        System.out.println(novaStringVazia);

        System.out.println("--------------");

        String novaString = new String("Aula");
        System.out.println(novaStringVazia);

        System.out.println("--------------");

        //aloca um espaço na memória
        String novaString1 = new String(novaString);
        System.out.println(novaString1);
        System.out.println("--------------");

        char[] charsJava = {'J', 'A', 'V', 'A'};
        String novaString2 = new String(charsJava);
        System.out.println(novaString2);

        System.out.println("--------------");

        char[] abcdef = {'A', 'B', 'C', 'D', 'E', 'F'};
        String abc = new String(abcdef, 0, 3);
        System.out.println(abc);

        System.out.println("--------------");

        byte[] ascii = {65, 66, 67, 68, 69};
        String abcde = new String(ascii);
        System.out.println(abcde);

        System.out.println("--------------");

        String bcd = new String(ascii, 1, 3);
        System.out.println(bcd);

        //ambas apontam para o mesmo endereço de memória, pois as strings são exatamentes iguais
        String atribuicao = "JAVA";
        String atribuicao1 = "JAVA";

        System.out.println(atribuicao);  //debug
        System.out.println(atribuicao1);  //debug
    }
}
