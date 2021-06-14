package com.sumanth.java8.ch8arrays;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        int[][] intArray2 = {{10, 20, 30}, {40, 50}, {60, 70, 80}};
        int[] intArray3 = {5, 3, 10, 1};
        String[] stringArray = {"ram", "ravan", "rajan"};

        for (int[] intArrayTemp : intArray2) {
            for (int intValue : intArrayTemp) {
                System.out.print(intValue + " ");
            }
            System.out.println();
        }

        Arrays.sort(intArray3);//quicksort non stable
        Arrays.sort(stringArray);//mergesort stable
        System.out.println(Arrays.toString(intArray3));
        System.out.println(Arrays.toString(stringArray));

        Arrays.fill(intArray, 10);
        System.out.println(Arrays.toString(intArray));

        int result = Arrays.binarySearch(intArray3, 10);
        System.out.println(result);// < 0 not present

        Arrays.equals(intArray, intArray3);//items are same order is same

        int[] intArray3Copy = Arrays.copyOf(intArray3, 2);
        System.out.println(Arrays.toString(intArray3Copy));

        int[][] nums = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = i + j;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }


    }
}
