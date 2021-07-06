package com.sumanth.java.java8.ch15lambdaFI;

import java.util.*;
import java.util.function.*;

@FunctionalInterface
interface Sum {
    void sum(int a, int b);

    static void staticGreeting(){
        System.out.println("Greeting from static method");
    }
}

interface Greetings {
    void greet();
}

interface Greetings2 {
    void greet(String msg);
}

class Greetings3{
    Greetings3(String str) {
        System.out.println(str);
    }
}

public class LambdaFIBasics {
    // why java 8? 1)simplify programming 2) fun features 3) parallel programming
    //  Lambda - anonymous function - closure
    public static void main(String[] args) {
        Sum sum = Integer::sum;
        sum.sum(10, 20);
        Greetings greetings = () -> System.out.println("Hello World");
        greetings.greet();
        Greetings2 greetings2 = msg -> System.out.println("Hello World " + msg);
        greetings2.greet("Java");

        //Predefined FI
        Predicate<String> stringPredicate = msg -> msg.equals("sumanth");
        stringPredicate.test("sumanth");
        Function<String, String> stringFunction = (s) -> s+":"+s.length();
        stringFunction.apply("sumanth");
        Consumer<String> stringConsumer = msg -> System.out.println(msg.toLowerCase());
        stringConsumer.accept("sumanth");
        Supplier<Double> generateDouble = Math::random;
        generateDouble.get();
        UnaryOperator<String> transformToUppercase = String::toUpperCase;
        transformToUppercase.apply("Sumanth");

        //Method Reference
        //1) static method reference
        Greetings greetingsStaticReference = Sum::staticGreeting;
        greetingsStaticReference.greet();
        //2) instance method reference
        LambdaFIBasics lambdaFIBasics = new LambdaFIBasics();
        Greetings greetingsInstanceReference = lambdaFIBasics::instanceGreeting;
        greetingsInstanceReference.greet();
        //3) ref to instance method of an arbitrary object of a particular type
        String[] names = {"sumanth", "Sumanth", "Reddy", "Adam", "adam"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
        //4)
        Greetings2 greetings21 = Greetings3::new;
        greetings21.greet("sumanth");

        List<String> list = new ArrayList<>();
        list.forEach(System.out::println);
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.forEach((k, v) -> System.out.println(k +" "+v));

        Runnable r = () -> System.out.println(Thread.currentThread().getName());
        new Thread(r).start();
        //Comparable<String> stringComparable = o1 -> o1.length() >


    }

    public void instanceGreeting(){
        System.out.println("greetings from instance me");
    }
}
