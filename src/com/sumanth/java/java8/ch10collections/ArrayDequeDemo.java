package com.sumanth.java.java8.ch10collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        //Array Double Ended Queue
        //not thread safe

        //addFirst
        //addLast
        //removeFirst
        //removeLast

        Deque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(1);
        arrayDeque.add(2);
        arrayDeque.add(3);
        arrayDeque.offerFirst(0);
        arrayDeque.offerLast(4);


    }
}
