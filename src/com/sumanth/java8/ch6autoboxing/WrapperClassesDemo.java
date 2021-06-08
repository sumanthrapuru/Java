package com.sumanth.java8.ch6autoboxing;

public class WrapperClassesDemo {
    public static void main(String[] args) {
        Number number = null;
        Character character = null;
        Boolean bool = null;
        Object obj = number;
        obj = character;
        obj = bool;
        Integer intObj = 55;
        intObj = Integer.valueOf(55);
        Double doubleObj = Double.valueOf(30);
        intObj = Integer.valueOf("10");
        intObj = Integer.valueOf("10", 2);

        intObj.byteValue();
        intObj.shortValue();
        intObj.intValue();
        intObj.longValue();
        intObj.floatValue();
        intObj.doubleValue();

        int i = Integer.valueOf("10").intValue();
        i = Integer.parseInt("10");

        Integer.toString(10);

        intObj.compareTo(10);
        System.out.println(new Boolean(true).compareTo(false));// false true

        intObj.equals(10);
        System.out.println(intObj == Integer.valueOf(2));//true
        System.out.println(Integer.valueOf(1000) == Integer.valueOf(1000));//false

        double d = 9.59;
        double d2 = 20.59;
        System.out.println(Math.ceil(9.5));
        Math.floor(10.1);
        System.out.println(Math.round(d));
        Math.min(d, d2);
        Math.max(d, d2);
        Math.random();//0.0 <1.0// seldom random or true random

        Character ch = 'a';
        Character ch2 = '9';
        Character.isLetter(ch);
        Character.isDigit(ch2);
        Character ch3 = ' ';
        Character.isWhitespace(ch3);
        Character ch4 = 'A';
        Character.isUpperCase(ch4);
        Character ch5 = 'e';
        Character.isLowerCase(ch5);
        System.out.println("\" \\ \t \' \n");

    }
}
