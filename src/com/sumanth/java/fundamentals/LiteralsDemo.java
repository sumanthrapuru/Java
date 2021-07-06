package com.sumanth.java.fundamentals;

import java.math.BigDecimal;

public class LiteralsDemo {
    public static void main(String[] args) {
        int i = 0B10;//binary
        i = 0756;//octal
        i = 10;//decimal
        i = 0X000000000000000000041;//hexa
        System.out.println((char) i);

        float f = 3.4E38f;//6 digit precision
        double d = 1.7E308;//15 digit precision

        char c = 'B';//char literal
        c = '\u0042';//unicode hex code point
        c = 66;//int literal
        System.out.println(c);
        c = '\n';

        Boolean b = true;
        if(b){
            System.out.println("boolean unwraped");
        }

        System.out.println(0.1+0.2);//0.30000000000000004
        System.out.println(1-0.9);//0.09999999999999998

        System.out.println(new BigDecimal("1").subtract(new BigDecimal("0.9")));

        Integer ten = 10;
        ten++;
        System.out.println(ten);


    }
}
