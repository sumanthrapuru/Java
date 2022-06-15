package java8;


import java.util.*;
import java.util.stream.Collectors;

public class SetToMap {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.stream()
                .collect(Collectors.toMap(e -> e.toLowerCase(), e -> e.toUpperCase()));
    }


}








