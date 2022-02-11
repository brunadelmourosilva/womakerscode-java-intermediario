package com.bruna.javaintermediario.threads.classes;

public class MinhaThread73 implements Runnable {

    private String nome;
    private boolean estaSuspensa;
    private boolean foiTerminada;

    public MinhaThread73(String nome) {
        this.nome = nome;
        this.estaSuspensa = false;
        new Thread(this, nome).start();
        //Thread t = new Thread(this, nome);
        //t.start();
    }

    @Override
    public void run() {

        System.out.println("Executando " + this.nome);

        try {
            for (int i = 0; i < 10; i++){
                System.out.println("Thread " + nome + ", " + i);
                Thread.sleep(300);
                synchronized (this) { //classe sincronizada
                    while (estaSuspensa){
                        wait();
                    }
                    if (this.foiTerminada){
                        break;
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread " + this.nome + " terminada.");
    }

    public void suspend(){
        this.estaSuspensa = true;
    }

    //método notify só funciona se for sincronizado
    public synchronized void resume(){
        this.estaSuspensa = false;
        notify();
    }

    public synchronized void stop(){
        this.foiTerminada = true;
        notify();
    }
}
