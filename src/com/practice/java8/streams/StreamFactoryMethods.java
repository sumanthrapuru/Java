package com.practice.java8.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamFactoryMethods {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        Stream.iterate(1, x -> x * 2)
                .limit(100);
        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream.generate(integerSupplier)
                .limit(10);
    }
}
