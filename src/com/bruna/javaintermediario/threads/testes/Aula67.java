package com.bruna.javaintermediario.threads.testes;

import com.bruna.javaintermediario.threads.classes.MinhaThread;

//instanciando a classe thread

public class Aula67 {
    public static void main(String[] args) {

        MinhaThread thread = new MinhaThread("Thread #1", 600);
        //thread.start();

        MinhaThread thread2 = new MinhaThread("Thread #2", 900);

        MinhaThread thread3 = new MinhaThread("Thread #3", 500);
    }

}
