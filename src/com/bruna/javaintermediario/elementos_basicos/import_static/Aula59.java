package com.bruna.javaintermediario.elementos_basicos.import_static;

//static import
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Aula59 {
    public static void main(String[] args) {

        double a = 2;
        double b = 3;
        double c = 4;

        System.out.println(Math.pow(a, b));

        System.out.println(Math.sqrt(c));

        //economizar Math.
        System.out.println(pow(a, b));
        System.out.println(sqrt(c));
    }
}



