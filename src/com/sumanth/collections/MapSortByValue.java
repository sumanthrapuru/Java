package com.sumanth.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSortByValue {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("a", 10);
        myMap.put("b", 20);
        myMap.put("c", 5);
        myMap.put("d", 0);
        myMap.put("e", -10);
        myMap.put("f", 5);


        myMap.entrySet().stream()
                .collect(Collectors.toMap(e -> e.getValue(), e -> e.getKey(), (s1, s2) -> s1 + "," + s2, HashMap::new))
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(e -> System.out.printf("key %d value %s \n", e.getKey(), e.getValue()));

        System.out.println(-2 >>> 1);

    }

}