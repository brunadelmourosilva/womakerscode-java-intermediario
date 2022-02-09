package com.bruna.javaintermediario.elementos_basicos.classes_aninhadas;

public class Externa {

    private String texto = "texto externo";

    public class Interna{

        private String texto = "texto interno";

        public void imprimeTexto(){
            System.out.println(texto); //imprime classe interna

            //consegue ver membros da classe externa
            System.out.println(Externa.this.texto); //imprime classe externa
        }
    }

    public static void main(String[] args){

        Externa externa = new Externa();
        Interna interna = externa.new Interna();

        interna.imprimeTexto();
    }
}