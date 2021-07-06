package com.practice.lambda;

import com.practice.data.Student;
import com.practice.data.StudentDataBase;

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
}
