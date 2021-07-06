package com.sumanth.java.java8.ch4accessmodifiers;

public interface InterfaceDemo {
    public static final int CONSTANT_VALUE = 90;//no other modifier is applicable final - volatile static - transient
    public abstract void method();//no other modifier is applicable
}

interface Left{
    int x = 10;
    void m1();
}
interface Right{
    int x = 20;
    int m1();
}
//class Imp implements Left, Right{
//    int val = Left.x;
//    public int m1() {// m1 return type is different so ambiguity problem
//
//    }
//}