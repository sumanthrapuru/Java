package com.sumanth.java8.ch15lambdaFI;

public class LambdaFIBasics {
    // why java 8? 1)simplify programming 2) fun features 3) parallel programming
    //  Lambda - anonymous function - closure
    public static void main(String[] args) {
        FunInterface fi = () -> System.out.println("hi");
        FunInterface2 fi2 = String::length;
        FunInterface3 fi3 = (a, b) -> a%b;

        Runnable r = () -> System.out.println(Thread.currentThread().getName());
        new Thread(r).start();
        //Comparable<String> stringComparable = o1 -> o1.length() >


    }

}

@FunctionalInterface
interface FunInterface {
    void m1();
}

interface FunInterface2 {
    int m1(String s);
}

interface FunInterface3 {
    int m1(int a, int b);
}
