package com.bruna.javaintermediario.strings.testes;

public class Aula76 {

    public static void main(String[] args) {

        String curso = "Curso ";
        String java = "Java";

        String cursoJava = curso + java;

        System.out.println(curso);

        System.out.println("-----------------");

        String resultado2Com2 = "Resultado 2+2 = " + (2+2);
        System.out.println(resultado2Com2);

        System.out.println("-----------------");

        String resultado2Com2_ = "Resultado 2+2 = " + 2 + 2; //sem parênteses
        System.out.println(resultado2Com2_);

        System.out.println("-----------------");

        String um = String.valueOf(1); //transforma o número em String
        System.out.println(um);

        System.out.println("-----------------");

        String concatenacao = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad " +
                "minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea " +
                "commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit " +
                "essecillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat " +
                "non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        System.out.println(concatenacao);

        System.out.println("-----------------");

        //criando novas strings - disponível para o garbage collector
        //impacto na performace do código
        String concatenacao2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, ";
        concatenacao2 += "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad ";
        concatenacao2 += "minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea ";
        concatenacao2 += "commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit ";
        concatenacao2 += "essecillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat ";
        concatenacao2 += "non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        System.err.println(concatenacao2);
    }

}
