package com.bruna.javaintermediario.threads.testes;

import com.bruna.javaintermediario.threads.classes.MinhaThreadRunnable69;

public class Aula70 {

    public static void main(String[] args) {

        MinhaThreadRunnable69 thred1 = new MinhaThreadRunnable69("#1", 500);
        MinhaThreadRunnable69 thred2 = new MinhaThreadRunnable69("#2", 500);
        MinhaThreadRunnable69 thred3 = new MinhaThreadRunnable69("#3", 500);

        Thread t1 = new Thread(thred1);
        Thread t2 = new Thread(thred2);
        Thread t3 = new Thread(thred3);

        //definindo prioridade
        t1.setPriority(5);
        t2.setPriority(3);
        t3.setPriority(1);

        //constante
        t1.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }

}
