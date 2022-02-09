package com.bruna.javaintermediario.elementos_basicos.varargs;

public class Aula62 {

    public static void main(String[] args) {

        System.out.println(soma(1, 2));
        System.out.println(soma(1, 2, 3));

        int[] vetor = {1, 2, 3, 4, 5};
        System.out.println(soma(vetor));

        //varargs
        System.out.println(soma(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    //apenas com 2 parâmetros
    static int soma(int a, int b){
        return a + b;
    }

    //apenas com 3 parâmetros
    static int soma(int a, int b, int c){
        return a + b + c;
    }

    //apenas um vetor
    static int soma(int[] vetor){
        int total = 0;

        for (int i=0; i<vetor.length; i++){
            total += vetor[i];
        }

        return total;
    }

    //passando valores sem declarar vários números em um vetor
    static int soma(int a, int b, Integer... vetor){

        int total = 0;

        for (int i=0; i<vetor.length; i++){
            total += vetor[i];
        }

        return total;
    }
}
