package com.sumanth.java.java8.ch6wrapperclasses;

public class WrapperClassesDemo {
    public static void main(String[] args) {
        Number number = null;//Byte Short Integer Long Float Double
        Character character = null;
        Boolean bool = null;

        Integer intObj = 55;//Integer.valueOf(55);
        intObj.byteValue();
        intObj.shortValue();
        intObj.intValue();
        intObj.longValue();
        intObj.floatValue();
        intObj.doubleValue();

        intObj = Integer.valueOf("10");
        intObj = Integer.valueOf("10", 2);
        intObj.toString();

        String integerString = Integer.toString(10);
        int i = Integer.parseInt(integerString);//Integer.valueOf("10").intValue();

        intObj.compareTo(10);
        System.out.println(new Boolean(true).compareTo(false));// sorted order for boolean {false, true}

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
