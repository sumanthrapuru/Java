package com.practice.java8.interfaceenhancements.inheritence;

public interface Interface4 {

    default void methodA(){
        System.out.println("Inside method A"+Interface4.class);
    }
}
