package com.bruna.javaintermediario.elementos_basicos.annotations;

//criando uma própria anotação

@interface InformacaoAula {

    String autor();

    int aulaNumero();

    //valores padrões
    String blog() default "http://loiane.com";

    String site() default "http://loiane.training";
}
