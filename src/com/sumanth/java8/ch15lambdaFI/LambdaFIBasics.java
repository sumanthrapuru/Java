package com.sumanth.java8.ch15lambdaFI;

interface Sum {
    int sum(int a, int b);
}

interface Greetings {
    void greet();
}

interface Greetings2 {
    void greet(String msg);
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

public class LambdaFIBasics {
    // why java 8? 1)simplify programming 2) fun features 3) parallel programming
    //  Lambda - anonymous function - closure
    public static void main(String[] args) {
        Sum sum = Integer::sum;
        sum.sum(10, 20);
        Greetings greetings = () -> System.out.println("Hello World");
        greetings.greet();
        Greetings2 greetings2 = msg -> System.out.println("Hello World " + msg);
        greetings2.greet("Java");

        FunInterface fi = () -> System.out.println("hi");
        FunInterface2 fi2 = String::length;
        FunInterface3 fi3 = (a, b) -> a % b;

        Runnable r = () -> System.out.println(Thread.currentThread().getName());
        new Thread(r).start();
        //Comparable<String> stringComparable = o1 -> o1.length() >


    }

}
