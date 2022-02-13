package com.sumanth.java.java8.ch10collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayListConversion {
    public static void main(String[] args) {

        double a = 13;
        double b = 12.544;
        BigDecimal bd = BigDecimal.valueOf(a);
        BigDecimal subtractionValue = BigDecimal.valueOf(b);
        bd = bd.subtract(subtractionValue);
        System.out.println(bd.doubleValue());
        System.out.println(a-b);
//        return bd.doubleValue();
        System.out.println(BigDecimal.valueOf(0D));
    }
}
