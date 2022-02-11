package com.bruna.javaintermediario.threads.exercicios;

public class SemaforoThread implements Runnable{

    private Cores cor;
    private boolean pararThread;
    private boolean corMudou;

    public SemaforoThread() {
        this.cor = Cores.VERMELHO; //cor inicial

        this.pararThread = false;
        this.corMudou = false;

        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!pararThread){
            try {
				switch (this.cor) {
				case VERMELHO:
					Thread.sleep(2000);
					break;
				case AMARELO:
					Thread.sleep(300);
					break;
				case VERDE:
					Thread.sleep(1000);
					break;
				default:
					break;
				}
                this.mudarCor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public synchronized void esperaCorMudar(){
        while(!this.corMudou){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.corMudou = false;
    }

    private synchronized void mudarCor(){
        switch (this.cor) {
            case VERMELHO:
                this.cor = Cores.VERDE;
                break;
            case AMARELO:
                this.cor = Cores.VERMELHO;
                break;
            case VERDE:
                this.cor = Cores.AMARELO;
                break;
            default:
                break;
        }
        this.corMudou = true;
        notify();
    }

    public synchronized void desligarSemafaro(){
        this.pararThread = true;
    }

    public Cores getCor() {
        return cor;
    }
}
