package com.practice.java8.streams;

import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    static class Sum{
        int total;
        void sum(int i){
            total += i;
        }
    }

    public static long performaceResult(Supplier<Integer> supplier, int noOfTimes){
        long millies = System.currentTimeMillis();

        for(int i = 0; i < noOfTimes; i++){
            supplier.get();
        }
        long endmillies = System.currentTimeMillis();
        return endmillies-millies;
    }

    public static int sequentialSum(){
        return IntStream.rangeClosed(1, 1000000000)
                .sum();
    }

    public static int parallelSum(){
        return IntStream.rangeClosed(1, 1000000000)
                .parallel()
                .sum();
    }

    public static void main(String[] args) {
        //System.out.println(performaceResult(ParallelStreamExample::sequentialSum, 2));
        //System.out.println(performaceResult(ParallelStreamExample::parallelSum, 2));
        //System.out.println(Runtime.getRuntime().availableProcessors());

        //when not to use parallel streams
        Supplier<Integer> sumSupplier = () -> IntStream.rangeClosed(0, 10000)
                .boxed()
                .collect(Collectors.toList())
                .stream()
                .reduce(0, (x, y)-> x+y);
        System.out.println(performaceResult(sumSupplier, 20));
        System.out.println(performaceResult(sumSupplier, 20));

        Sum sum = new Sum();
        IntStream.rangeClosed(0, 1000)
                //.parallel()//incorrect results
                .forEach(sum::sum);
        System.out.println(sum.total);
    }
}
