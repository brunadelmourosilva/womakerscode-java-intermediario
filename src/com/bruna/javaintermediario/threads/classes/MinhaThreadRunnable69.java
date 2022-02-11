package com.bruna.javaintermediario.threads.classes;

public class MinhaThreadRunnable69 implements Runnable {

    private String nome;
    private int tempo;

    public MinhaThreadRunnable69(String nome, int tempo){
        this.nome = nome;
        this.tempo = tempo;
        //Thread t = new Thread(this);
        //t.start();
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i < 6; i++){
                System.out.println(nome + " contador " + i);
                Thread.sleep(tempo);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nome + " terminou a execução");
    }

}
