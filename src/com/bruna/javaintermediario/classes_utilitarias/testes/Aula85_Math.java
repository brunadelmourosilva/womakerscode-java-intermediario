package com.bruna.javaintermediario.classes_utilitarias.testes;

public class Aula85_Math {

    public static void main(String[] args) {

        //potência
        System.out.println(Math.pow(2, 3));

        //arredonda para 5
        System.out.println(Math.round(4.7));

        //arredonda para 4
        System.out.println(Math.round(4.4));

        //arredonda para cima
        System.out.println(Math.ceil(4.4));
        System.out.println(Math.ceil(4.7));

        //arredonda para baixo
        System.out.println(Math.floor(4.4));
        System.out.println(Math.floor(4.7));

        //gera um número aleatório de 0 a 100
        System.out.println(Math.round(Math.random() * 100));

        //funções trigonométricas
        System.out.println(Math.sin(Math.toRadians(30)));
        System.out.println(Math.cos(Math.toRadians(1)));
        System.out.println(Math.tan(Math.toRadians(45)));
    }
}
