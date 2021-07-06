package com.practice.java8.lambda;

import java.util.Comparator;
import java.util.Locale;
import java.util.Random;
import java.util.function.*;

public class LambdaUsageDemo {
    public static void main(String[] args) {
        //Old way
        Thread printThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello ");
                System.out.println("I am from runnable");
            }
        });

        Comparator<Integer> integerComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(integerComparator.compare(50, 10));

        //new way
        Thread printThread2 = new Thread(() -> {
            System.out.println("Hello ");
            System.out.println("I am from lambda");
        });
        Comparator<Integer> integerComparator1 = (o1, o2) -> o1.compareTo(o2);

        //Functional Interfaces examples
        // 1) Consumer
        Consumer<String> stringConsumer = s -> {
            System.out.println(s.concat("f").substring(1, s.length()));
        };

        // 2)
        Supplier<Integer> randomIntGenerator = () -> new Random().nextInt();

        // 3)
        Predicate<Integer> checkEvenNoPredicae = i -> i % 2 == 0;

        BiPredicate<Integer, Integer> firstDivBySecond = (i1, i2) -> i1 % i2 == 0;

        // 4)
        Function<String, Integer> calLengthOfString = s -> s.length();

        BiFunction<String, Integer, String> concatLength = (s, i) -> s + i;

        UnaryOperator<String> toUpperCaseFunc = s -> s.toUpperCase(Locale.ROOT);

        BinaryOperator<String> concatToUpperCaseFunc = (s1, s2) -> s1.concat(s2).toUpperCase();


    }
    static void m(){
        int i = 0;

        //Consumer<Integer> consumer = i -> System.out.println(i);
        Consumer<Integer> consumer = intvalue -> {
            //int i = 0;
            //i++; local var is effectively final
            System.out.println(i);
        };
        //i++;//inside lambda where used get CE effectively final
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(i);//prior java 8 i has to be final
            }
        };
    }
}
