package com.sumanth.java.java8.ch8arrays;

import java.awt.geom.Arc2D;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayUtils {
    @SuppressWarnings("unchecked")
    public static <T> T[] concat( T[] firstArr,  T[]... remainingArr) {
        return Stream.concat(Arrays.stream(firstArr), Arrays.stream(remainingArr).flatMap(Arrays::stream)).toArray(
                size -> (T[]) Array.newInstance(firstArr.getClass().getComponentType(), size)
        );
    }

    static <T> void checkType(T data){
        if(data instanceof String){
            System.out.println("Stirng");
        } else if(data instanceof Double){
            System.out.println("Double");
        }
    }

    public static void main(String[] args) {
        System.out.println(
                BigDecimal.valueOf(13.000000000015).setScale(2, RoundingMode.HALF_UP)
        );

    }
}
