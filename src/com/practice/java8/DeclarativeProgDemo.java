package com.practice.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DeclarativeProgDemo {
    public static void main(String[] args) {
        //imperative
        int sum = 0;
        for(int i = 0; i <= 100; i++){
            sum += i;
        }
        System.out.println("sum calculated in imperative way" + sum);
        List<Integer> list = Arrays.asList(1,2,3,4,4,5,5,6,7,7,8,9,9);
        List<Integer> uniqueList = new ArrayList<>();
        for(Integer i : list){
            if(!uniqueList.contains(i)){
                uniqueList.add(i);
            }
        }
        System.out.println(uniqueList);
        //declarative
        int sumDeclarative = IntStream.rangeClosed(0, 100)
                .parallel()
                .sum();
        System.out.println("sum calculated in declarative way" + sumDeclarative);
        List<Integer> uniqueListDeclarative = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueListDeclarative);

    }
}
