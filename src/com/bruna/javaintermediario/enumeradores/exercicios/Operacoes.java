package com.bruna.javaintermediario.enumeradores.exercicios;

public enum Operacoes {

    SOMA("+"){
        @Override
        double executarOperacao(double x, double y){
            return x + y;
        }
    }, SUBTRACAO("-"){
        @Override
        double executarOperacao(double x, double y){
            return x - y;
        }
    }, MULTIPLICACAO("*"){
        @Override
        double executarOperacao(double x, double y){
            return x * y;
        }
    }, DIVISAO("/"){
        @Override
        double executarOperacao(double x, double y){
            return x / y;
        }
    };

    private String simbolo;

    Operacoes(String simbolo) {
        this.simbolo = simbolo;
    }


    @Override
    public String toString() {
        return this.simbolo;
    }

    abstract double executarOperacao(double x, double y);
}
