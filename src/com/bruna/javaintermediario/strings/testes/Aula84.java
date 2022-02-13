package com.bruna.javaintermediario.strings.testes;

import java.util.StringTokenizer;

public class Aula84 {

    public static void main(String[] args) {

        String doArquivo = "1;Antônio;30;";

        //Extraindo tokens
        StringTokenizer st = new StringTokenizer(doArquivo, ";");

        //hasMoreTokens - enquanto tem tokens
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken()); //nextToken - extração das informações
        }

    }
}
