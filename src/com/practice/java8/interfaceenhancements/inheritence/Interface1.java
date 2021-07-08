package com.practice.java8.interfaceenhancements.inheritence;

public interface Interface1 {

    default void methodA(){
        System.out.println("Inside method A"+Interface1.class);
    }
}
