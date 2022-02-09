package com.bruna.javaintermediario.elementos_basicos.classes_aninhadas;

public class Anonima {

    public void imprimeTexto(){
        System.out.println("qualquer texto");
    }

    public static void main(String[] args){

        //instancia a classe e muda seu comportamento
        Anonima anonima = new Anonima(){
            public void imprimeTexto(){
                System.out.println("qualquer texto que foi sobrescrito");
            }
        };

        anonima.imprimeTexto();

        //usando interface
        Texto texto = new Texto() {
            @Override
            public void imprimeTexto() {
                System.out.println("qualquer texto - interface");
            }
        };

        texto.imprimeTexto();
    }
}
