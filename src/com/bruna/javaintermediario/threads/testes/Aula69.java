package com.bruna.javaintermediario.threads.testes;

import com.bruna.javaintermediario.threads.classes.MinhaThreadRunnable69;

public class Aula69 {

    public static void main(String[] args) {

        MinhaThreadRunnable69 thread1 = new MinhaThreadRunnable69("#1", 500);
        MinhaThreadRunnable69 thread2 = new MinhaThreadRunnable69("#2", 500);
        MinhaThreadRunnable69 thread3 = new MinhaThreadRunnable69("#3", 500);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();

//        while(t1.isAlive() || t2.isAlive() || t3.isAlive()){
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        System.out.println("Programa finalizado");

        //join -> espera a execução da thread, para continuar com o código
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Programa finalizado");

    }
}

//for (int i=0; i < 15; i++)

//while(t1.isAlive() || t2.isAlive() || t3.isAlive())

