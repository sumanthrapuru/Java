package com.practice.algorithms.recursion;

import java.util.Arrays;

public class RecursionStandardProblems {


    //rope cutting O(k^n)
    static int maxRopeCount(int[] diffLengths, int ropeLength) {
        if (ropeLength == 0) return 0;
        if (ropeLength < 0) return -1;

        int[] result = new int[diffLengths.length];

        for (int i = 0; i < diffLengths.length; i++) {
            if (ropeLength - diffLengths[i] < 0) {
                result[i] = -1;
            } else {
                int recResult = maxRopeCount(diffLengths, ropeLength - diffLengths[i]);
                if (recResult == -1) {
                    result[i] = -1;
                } else {
                    result[i] = 1 + recResult;
                }
            }
        }
        if (Arrays.stream(result).allMatch(i -> i == -1)) {
            return -1;
        }
        return Arrays.stream(result).max().orElse(0);
    }

//    public static void main(String[] args) {
//        int max = maxRopeCount(new int[]{5, 7}, 10);
//        System.out.printf("possible max ropes: %d", max);
//    }

    //tower of hanoi
    static void toh(int noOfDisks, String from, String to, String aux) {
        if (noOfDisks == 0) return;

        toh(noOfDisks - 1, from, aux, to);
        System.out.println("moved disk from " + from + " to " + to);
        toh(noOfDisks - 1, aux, to, from);
    }

//    public static void main(String[] args) {
//        toh(2, "A", "C", "B");
//    }


    //josephus problem
    static int josephus(int n, int k){
        if(n == 1) return 0;
        return (josephus(n-1, k) + k) % n;
    }

    static int josephusIndexStartsFromOne(int n, int k){
        return 1 + josephus(n, k);
    }

//    public static void main(String[] args) {
//        int remainingPerson = josephusIndexStartsFromOne(3, 2);
//        System.out.println(remainingPerson);
//    }

    //generate subsets
    static void printSubsets(String str, String cur, int i){
        if(i == str.length()){
            System.out.println(cur);
            return;
        }
        printSubsets(str, cur, i+1);
        printSubsets(str, cur+str.charAt(i), i+1);
    }

//    public static void main(String[] args) {
//        printSubsets("abc", "", 0);
//    }
    //subset sum equals to given sum
    //O(2 ^ n)
    //optimize with back tracking or dp
    static int countSubsetsWithGivenSum(int[] arr, int n, int sum){
        if(n == 0){
            return (sum == 0) ? 0 : 1;
        }
        return countSubsetsWithGivenSum(arr, n-1, sum) +
                countSubsetsWithGivenSum(arr, n-1, sum - arr[n-1]);
    }


    //printing permutaions
    static void printPermutations(char[] str, int i) {
        if(i == str.length){
            System.out.println(str);
            return;
        }
        for(int j = i; j < str.length; j++){
            swap(str, i, j);
            printPermutations(str, i+1);
            swap(str, i, j);
        }
    }
    static void swap(char[] str, int i, int j){
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    public static void main(String[] args) {
        printPermutations("abc".toCharArray(), 0);
    }
}
