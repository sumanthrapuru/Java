package interview2;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo16 {
    public static void main(String[] args) {
        Integer[] arr = {6,3, 7, 6, 4, 8, 6, 8};
        Map<Integer, Long> temp = Arrays.stream(arr)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        temp.entrySet().stream().filter(e -> e.getValue() > 1).forEach(e -> System.out.println(e.getKey()));




    }

}
