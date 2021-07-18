package com.practice.algorithms.recursion;

import java.util.Arrays;

public class RecursionStandardProblems {


    //rope cutting O(k^n)
    static int maxRopeCount(int[] diffLengths, int ropeLength) {
        if(ropeLength == 0) return 0;
        if (ropeLength < 0) return -1;

        int[] result = new int[diffLengths.length];

        for (int i = 0; i < diffLengths.length; i++) {
            if (ropeLength - diffLengths[i] < 0) {
                result[i] = -1;
            } else {
                int recResult = maxRopeCount(diffLengths, ropeLength - diffLengths[i]);
                if(recResult == -1){
                    result[i] = -1;
                }else {
                    result[i] = 1 + recResult;
                }
            }
        }
        if (Arrays.stream(result).allMatch(i -> i == -1)) {
            return -1;
        }
        return Arrays.stream(result).max().orElse(0);
    }

    public static void main(String[] args) {
        int max = maxRopeCount(new int[]{5, 7}, 10);
        System.out.printf("possible max ropes: %d", max);
    }

    //generate subsets
    //tower of hanoi


    //josephus problem
    //subset sum
    //printing permutaions


    static void printPermutations(int[] arr) {

    }
}
