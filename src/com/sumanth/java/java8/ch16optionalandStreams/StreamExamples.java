package com.sumanth.java.java8.ch16optionalandStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
        //Stream
        //  1) Configure
        //      Filter or Map
        //  2) Processing
        //      collect count sorted min or max forEach toArray
        //  3) Stream.of()

        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(101);

        List<Integer> evenList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList);
        list.stream().map(i -> i % 100).collect(Collectors.toList());
        list.stream().filter(i -> i % 2 == 0).count();
        list.stream().sorted().collect(Collectors.toList());
        list.stream().sorted((i1, i2) -> i2 - i1).collect(Collectors.toList());
        list.stream().min((i1, i2) -> i2 - i1).get();
        list.stream().max((i1, i2) -> i2 - i1).get();
        list.stream().forEach(i -> System.out.println(i));
        list.stream().forEach(System.out::println);
        list.stream().toArray(Integer[]::new);

        Stream<Integer> s = Stream.of(1, 2, 3, 4, 5);
        System.out.println(s.map(i -> i*10).collect(Collectors.toList()));


    }
}
