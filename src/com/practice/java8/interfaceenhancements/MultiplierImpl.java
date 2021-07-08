package com.practice.java8.interfaceenhancements;

import java.util.List;

public class MultiplierImpl implements Multiplier{
    @Override
    public int multiply(List<Integer> list) {
        return list.stream().reduce(1, (x, y) -> x * y);
    }


}
