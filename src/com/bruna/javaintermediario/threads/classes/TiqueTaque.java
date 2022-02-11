package com.bruna.javaintermediario.threads.classes;

public class TiqueTaque {

    boolean tique;

    synchronized void tique(boolean estaExecutando){ //tique executando

        if (!estaExecutando){
            tique = true;
            notify(); //notifica a outra thread
            return;
        }

        System.out.print("Tique ");

        tique = true;

        notify(); //taque pode ser executada

        try {
            while (tique){
                wait(); //esperar pelo taque ser executado
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void taque(boolean estaExecutando){

        if (!estaExecutando){
            tique = false;
            notify();
            return;
        }

        System.out.println("Taque");

        tique = false;

        notify();

        try {
            while (!tique){
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
