package com.sumanth.java.java8.ch9generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {
    public static void main(String[] args) {
        //no explicit type casting
        //compile time type checking
        printArray(new Integer[]{1, 2});
        printArray(new Character[]{'1', '2'});

        System.out.println(new ClassName<String>("sumanth").contents);

        Box<Integer> box1 = new Box<>(100);
        System.out.println(box1.getElement());

        printNumbers(new ArrayList<Integer>());
        printParent(new ArrayList<Integer>());
        printAll(new ArrayList<String>());

    }

    static void printNumbers(List<? extends Number> numbers){
        for(Number num : numbers) System.out.print(num);
    }

    static void printParent(List<? super Integer> numParentObjs){
        //for(Integer obj : numParentObjs) System.out.print(obj);//CE Integer
        numParentObjs.add(10);
    }

    static void printAll(List<?> list){
        for(Object item : list){
            System.out.println(item);
        }
    }

    static <T> void printArray(T[] array) {
        for (T e : array) {
            System.out.print(e+" ");
        }
    }
}

class ClassName<T>{
    T contents;
    ClassName(T t){
        contents = t;
    }
}

class Box<T extends Number>{
    private T element;
    Box(T element){
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}