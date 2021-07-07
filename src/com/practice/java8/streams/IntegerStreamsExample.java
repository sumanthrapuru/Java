package com.practice.java8.streams;

import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntegerStreamsExample {
    static class Id{
        private int id;
        Id(int i){

        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10);
        IntStream.range(1, 10);//till 9
        IntStream.of(1, 5, 4);
        IntStream.range(1, 10).asDoubleStream();
        IntStream.range(1, 10).sum();
        OptionalInt optionalInt = IntStream.range(1, 10).min();
        IntStream.range(1, 10).max();
        OptionalDouble optionalDouble = IntStream.range(1, 10).average();
        List<Integer> boxedInt = IntStream.range(1, 10)
                .boxed()
                .collect(Collectors.toList());
        boxedInt.stream()
                .mapToInt(Integer::intValue)
                .sum();
        IntStream.range(1, 10)
                .mapToObj(Id::new)
                .map(Id::getId)
                .reduce(0, (x, y) -> x+y);

    }

}
