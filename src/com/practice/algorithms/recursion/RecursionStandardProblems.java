package com.practice.algorithms.recursion;

import java.util.Arrays;

public class RecursionStandardProblems {

    static void recPractice(int n, int level) {
        if (n == 0) return;
        recPractice(n - 1, level + 1);
        System.out.format("n %d level %d \n", n, level);
        recPractice(n - 1, level + 1);
    }

//    public static void main(String[] args) {
//        recPractice(3, 1);
//    }

    static void printBinaryRep(int n){
        if(n == 0) return;
        System.out.print(n % 2);
        printBinaryRep(n / 2);
    }

//    public static void main(String[] args) {
//        printBinaryRep(5);
//    }

    static void print1ToN(int n){
        if(n==0) return;
        print1ToN(n-1);
        System.out.println(n);
    }

    static void print1ToNTailRecursion(int n, int accumulator) {
        if(n==0) return;
        System.out.println(accumulator);
        print1ToNTailRecursion(n-1, accumulator+1);
    }

//    public static void main(String[] args) {
//        print1ToNTailRecursion(3, 1);
//    }

    static int factorial(int n){
        if(n == 0) return 1;
        return n * factorial(n - 1);
    }

    static int factorialTailRec(int n, int accumulator){
        if(n == 0) return accumulator;
        return factorialTailRec(n-1, accumulator*n);
    }

//    public static void main(String[] args) {
//        System.out.println(factorialTailRec(5, 1));
//    }

    static boolean palindrome(String str, int start, int end){
        if(start >= end) return true;
        return str.charAt(start) == str.charAt(end) &&
                palindrome(str, start+1, end-1);
    }

//    public static void main(String[] args) {
//        String s = "geeks ";
//        System.out.println(palindrome(s, 0,  s.length()-1));
//    }

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

    //tower of hanoi O(2 ^ n)
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
    //reccurance relation T(n) = T(n-1) + 1 Theta(n)
    static int josephus(int n, int k) {
        if (n == 1) return 0;
        return (josephus(n - 1, k) + k) % n;
    }

    static int josephusIndexStartsFromOne(int n, int k) {
        return 1 + josephus(n, k);
    }

//    public static void main(String[] args) {
//        int remainingPerson = josephusIndexStartsFromOne(3, 2);
//        System.out.println(remainingPerson);
//    }

    //generate subsets O(2 ^ length of string)
    static void printSubsets(String str, String cur, int i) {
        if (i == str.length()) {
            System.out.println(cur);
            return;
        }
        printSubsets(str, cur, i + 1);
        printSubsets(str, cur + str.charAt(i), i + 1);
    }

    //    public static void main(String[] args) {
//        printSubsets("abc", "", 0);
//    }
    //subset sum equals to given sum
    //O(2 ^ n)
    //optimize with back tracking or dp
    static int countSubsetsWithGivenSum(int[] arr, int n, int sum) {
        if (n == 0) {
            return (sum == 0) ? 0 : 1;
        }
        return countSubsetsWithGivenSum(arr, n - 1, sum) +
                countSubsetsWithGivenSum(arr, n - 1, sum - arr[n - 1]);
    }


    //printing permutaions
    //O(n!)
    static void printPermutations(char[] str, int i) {
        if (i == str.length) {
            System.out.println(str);
            return;
        }
        for (int j = i; j < str.length; j++) {
            swap(str, i, j);
            printPermutations(str, i + 1);
            swap(str, i, j);
        }
    }

    static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    public static void main(String[] args){
        printPermutations("abc".toCharArray(), 0);
    }
}
