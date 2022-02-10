package com.bruna.javaintermediario.threads.testes;

import com.bruna.javaintermediario.threads.classes.ThreadTiqueTaque;
import com.bruna.javaintermediario.threads.classes.TiqueTaque;

public class Aula72 {

    public static void main(String[] args) {

        TiqueTaque tt = new TiqueTaque();

        ThreadTiqueTaque tique = new ThreadTiqueTaque("Tique", tt);
        ThreadTiqueTaque taque = new ThreadTiqueTaque("Taque", tt);

        try {
            tique.t.join();
            taque.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
