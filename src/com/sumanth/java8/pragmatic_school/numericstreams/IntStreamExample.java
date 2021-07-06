package com.sumanth.java8.pragmatic_school.numericstreams;

import java.util.stream.*;

public class IntStreamExample {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 2)
                .sum();
        long longsum = LongStream.range(1, 2).sum();
        System.out.println(longsum);
        DoubleStream doubleStream = IntStream.rangeClosed(1, 50).asDoubleStream();

        Stream.of("a", "r")
                .collect(Collectors.joining());
    }
}
