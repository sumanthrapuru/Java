package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Why {
    public static void main(String[] args) {
        //diff b/w imperative vs declarative
        //sum
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        sum = IntStream.rangeClosed(0, 10)
                .parallel()
                .sum();

        //unique list
        List<Integer> list = Arrays.asList(1, 2);
        List<Integer> uniqueList = list.stream()
                .distinct()
                .collect(Collectors.toList());

        //Lambda are for FI
        //Runnable

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable job");
            }
        };

        r = () -> System.out.println("runnable job");

        r = () -> {
            System.out.println("runnable job line1");
            System.out.println("runnable job line2");
        };

        new Thread(() -> System.out.println("runnable job"));

        //Comparator

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        comparator = (Integer a, Integer b) -> {
            return a.compareTo(b);
        };

        comparator = (Integer a, Integer b) -> a.compareTo(b);
        comparator = (a, b) -> a.compareTo(b);

        //java 8 new FI

        //Consumer
        Consumer<String> consumer = c -> System.out.println(c.toUpperCase());



    }
}
