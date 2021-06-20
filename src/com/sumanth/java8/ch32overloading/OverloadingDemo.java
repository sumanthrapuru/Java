package com.sumanth.java8.ch32overloading;

public class OverloadingDemo {
    public static void main(String[] args) {
        new OverloadingDemo().m1(10);
    }
    void m1(byte b){
        System.out.println("byte");
    }
    void m1(int i){
        System.out.println("int");
    }
    void m1(long l){
        System.out.println("long");
    }
    void m1(float f){
        System.out.println("float");
    }
}
