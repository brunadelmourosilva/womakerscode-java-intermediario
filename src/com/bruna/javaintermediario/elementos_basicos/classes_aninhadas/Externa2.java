package com.bruna.javaintermediario.elementos_basicos.classes_aninhadas;

public class Externa2 {

    public void metodoQualquer(){

        //está declarada somente no escopo do método
        class ClasseLocal{

            private String texto = "texto classe local";

            public void imprimeTexto(){
                System.out.println(this.texto);
            }
        }

        ClasseLocal local = new ClasseLocal();
        local.imprimeTexto();
    }

    public static void main(String[] args){

        Externa2 externa = new Externa2();

        externa.metodoQualquer();
    }
}
