package com.practice.java8.interfaceenhancements.inheritence;

public interface Interface2 extends Interface1{

    default void methodB(){
        System.out.println("Inside method B");
    }

    default void methodA(){
        System.out.println("Inside method A "+ Interface2.class);
    }
}
