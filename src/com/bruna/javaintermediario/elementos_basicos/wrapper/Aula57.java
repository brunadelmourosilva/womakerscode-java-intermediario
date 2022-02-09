package com.bruna.javaintermediario.elementos_basicos.wrapper;

public class Aula57 {

    public static void main(String[] args) {

        //tipos primitivos
        short num1 = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 10000l;
        float num5 = 3.5f;
        double num6 = 3.55555;
        boolean flag = true;
        char a = 'a';

        //classes wrappers: são classes que representam os tipos primitivos do java
        Short num7 = new Short((short) 1); //ou (short) 1;
        Byte num8 = new Byte((byte)10);
        Integer num9 = new Integer(100);
        Long num10 = new Long(10000l);
        Float num11 = new Float(3.5f);
        Double num12 = new Double(3.5555);
        Boolean flag2 = new Boolean(true);
        Character b = new Character('b');


        Integer num13 = new Integer("100"); //NumberFormatException
        Double num14 = new Double("3.5"); //3,5 para quem usar PC Português Brasil


        //..value: converter um tipo para outro
        System.out.println(num13.intValue());
        System.out.println(num13.longValue());
        Long num15 = num13.longValue();


        //String para número do tipo int
        int num16 = Integer.parseInt("100000"); //NumberFormatException

        //String para número do tipo double
        double num17 = Double.parseDouble("3.555"); //NumberFormatException
        System.out.println(num17);


        //valueOf: converter número inteiro primitivo para Integer
        Integer num18 = Integer.valueOf(1343);
        System.out.println(num18);


        System.out.println(num9 == num13); //== não funciona com wrappers - false
        System.out.println(num9.equals(num13)); //true

        //classes boolean e char: super classe Object
        //classes de tipos numéricos: super classe Number
    }
}
