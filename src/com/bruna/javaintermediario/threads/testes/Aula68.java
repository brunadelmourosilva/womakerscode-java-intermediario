package com.bruna.javaintermediario.threads.testes;

//utilizando a interface Runnable

import com.bruna.javaintermediario.threads.classes.MinhaThreadRunnable;

public class Aula68 {

    public static void main(String[] args) {
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 900);
        //Thread t1 = new Thread(thread1); -> passando no construtor
        //t1.start();

        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 650);

        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 1100);
    }
}
