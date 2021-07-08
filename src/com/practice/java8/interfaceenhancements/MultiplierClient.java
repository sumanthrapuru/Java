package com.practice.java8.interfaceenhancements;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplierClient {
    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();
        int result = multiplier.multiply(Arrays.asList(1, 3, 5));
        System.out.println(result);
        System.out.println(multiplier.size(Arrays.asList(1, 3, 5)));
    }
}
