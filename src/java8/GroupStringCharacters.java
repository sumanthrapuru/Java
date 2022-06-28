package java8;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupStringCharacters {
    public static void main(String[] args) {
        Arrays.stream("acbajk".split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


    }
}
