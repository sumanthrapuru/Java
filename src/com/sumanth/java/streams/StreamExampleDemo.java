package com.sumanth.java.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExampleDemo {
    public static void main(String[] args) {
        //stream introduce to process collection of obj
        //supports various operations which can be pipelined to get desired result
        //not a ds
        //doesn't modify source
        //leverage multicore architecture
        //takes data from collection, arrays, io
        //provides interface to a seq set of values
        //streams dont store elements computed on demand
        //intermediate operations method chaining style
        // (filter, map, flatMap, distinct, sorted, peek, limit, skip)
        //terminal operations
        // (toArray, collect, count, reduce, forEach, forEachOther, ed, min, max, anyMatch, allMatch, noneMatch, findFirst, findAny)

        List<String> list = Arrays.asList("test", "Hi", "Hello", "Bye", "Tata", "test", "test2", "test");

        Map<String, String> map = new HashMap<>();
        map.put("name", "sumanth");

        //how to create streams
        Stream<Date> dateStream = Stream.of(new Date(), new Date());
        Stream<Integer> intStream = Stream.iterate(1, i -> i + 1).limit(100);
        Stream<Double> doubleStream = Stream.generate(Math::random).limit(10);

        IntStream intStream1 = IntStream.rangeClosed(64, 709000485);


        String[] names = {"just", "names"};
        Stream<String> arrayStream = Arrays.stream(names);

        //spliterator example
        Spliterator<String> spliterator = list.stream().spliterator();
        Spliterator<String> spliterator2 = spliterator.trySplit();
        spliterator.forEachRemaining(System.out::println);
        System.out.println("spliterator divided into half");
        spliterator2.forEachRemaining(System.out::println);

        // intermediate op (filter, map, flatMap, peak, distinct, sorted, limit, skip)
        list.stream()
                .filter(n -> 10 - 6 > 2)
                .flatMap(n -> Arrays.stream(n.split("")))//Stream<Stream<String>> -> Stream<String>
                .map(n -> n.toUpperCase())
                .forEach(s -> System.out.print(s + " "));

        list.stream()
                .distinct()
                .sorted()
                .limit(5)
                .skip(2)
                .peek(System.out::print)
                .forEach(System.out::println);
        /* Result peakoperation and terminal operation
        HiHi
        TataTata
        testtest
         */

        // terminal op (
        // toArray, collect, count, reduce
        // forEach, forEachOther
        // ed
        // min, max
        // anyMatch, allMatch, noneMatch
        // findFirst, findAny
        list.stream().collect(Collectors.toList());
        list.stream().count();
        list.stream().toArray();
        list.stream().reduce((a, b) -> a + b);
        list.stream().forEach(s -> System.out.println(s));

        list.stream().findAny().ifPresent(System.out::println);
        list.stream().findFirst().ifPresent(System.out::println);

        long start = System.currentTimeMillis();
        intStream1.filter(i -> i%2==0)
                //.parallel()
                .count();
        long end = System.currentTimeMillis();
        System.out.println("Time Consumed"+(end-start));


        List<Map.Entry<String, String>> sortedByValue = map.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .collect(Collectors.toList());

        Map<String, String> collectedMap = map.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));




    }
}
