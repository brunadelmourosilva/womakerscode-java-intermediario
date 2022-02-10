package com.bruna.javaintermediario.threads.testes;

import com.bruna.javaintermediario.threads.classes.MinhaThreadSoma;

public class Aula71 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        MinhaThreadSoma t1 = new MinhaThreadSoma("#1", array);

        MinhaThreadSoma t2 = new MinhaThreadSoma("#2", array);
    }
}
