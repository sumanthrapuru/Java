package com.sumanth.java8.pragmatic_school;

import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;

public class LambdaBasics {
    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("Hello"));
        Comparator<Integer> intComparator = (i1, i2) -> {
            i1++;
            return i1.compareTo(i2);
        };
    }
}
