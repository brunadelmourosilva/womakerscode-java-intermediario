package com.bruna.javaintermediario.threads.exercicios;

/*
* Crie um semáforo(sinal de trânsito) usando Threads.
* O semáforo deve ficar verde por x segundos, depois brevemente amarelo seguido
* de y segundos na cor vermelha.
* */

public class Semaforo {

    public static void main(String[] args) {

        SemaforoThread semafaro = new SemaforoThread();

        for (int i = 0; i < 10; i++){
            System.out.println(semafaro.getCor());
            semafaro.esperaCorMudar();
        }

        semafaro.desligarSemafaro();
    }

}
