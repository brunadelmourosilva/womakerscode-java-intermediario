package com.bruna.javaintermediario.threads.testes;

import com.bruna.javaintermediario.threads.classes.MinhaThread;
import com.bruna.javaintermediario.threads.classes.MinhaThread73;

public class Aula73 {

    public static void main(String[] args) {

        MinhaThread73 t1 = new MinhaThread73("#1");
        MinhaThread73 t2 = new MinhaThread73("#2");

        System.out.println("Pausando a Thread #1");

        t1.suspend();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Pausando a Thread #2");

        t2.suspend();

        System.out.println("Resumindo a Thread #1");

        t1.resume();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Resumindo a Thread #2");

        t2.resume();

        System.out.println("Terminando a Thread #2");

        t2.stop();
    }
}



