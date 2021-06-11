package com.sumanth.java8.ch7strings;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        //String Constant Pool is part of Heap
        //1 obj created in SCP if string literal 's' is not available in SCP another obj in heap
        String s1 = "sumanth";//"sumanth".intern();
        String s2 = new String("sumanth");
        String s3 = s2.intern();
        System.out.printf("s1 == s2 : %b", s1 == s2);
        System.out.printf("\ns1 == s3 : %b\n", s1 == s3);

        System.out.printf("s1 length is: %d,\n" ,
                s1.length());

        String s4 = s1 + s2;
        s1.concat(s2);//raises NPE

        s1.charAt(5);//raises IOBE

        System.out.println(s1.substring(5));//th
        System.out.println(s1.substring(5,7));//th(both are inclusive)

        s1.replace('s', 'S');
        s1.replaceAll("man", "han");

        s1.trim();

        String s5 = "This is split";
        String[] resArray = s5.split(" ", 2);
        Arrays.stream(resArray).forEach(System.out::println);

        //TODO: write custom immutable obj

        //any change in string new obj in heap
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hi").append(" ").append(1);
        stringBuilder.insert(3, 2);
        stringBuilder.delete(4, 5);//start, end-1
        stringBuilder.reverse();
        stringBuilder.toString();
        System.out.println(stringBuilder);

    }
}
