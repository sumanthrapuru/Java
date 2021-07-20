package com.practice.algorithms.arrays;

public class ArraysStandardProblems {

    //O(n)
    static int largestElement(int[] arr) {
        if (arr == null || arr.length <= 0) return -1;
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[largest] < arr[i]) {
                largest = i;
            }
        }
        return largest;
    }

    //O(n)
    static int secondLargest(int[] arr) {
        if (arr == null || arr.length <= 0) return -1;
        int largest = 0;
        int secondLargest = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[largest] < arr[i]) {
                secondLargest = largest;
                largest = i;
            } else if (arr[largest] != arr[i]) {//ignore if it is equal
                if (secondLargest == -1 || arr[secondLargest] < arr[i]) secondLargest = i;
            }
        }
        return secondLargest;
    }

    //O(n)
    static boolean isArraySorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) return false;
        }
        return true;
    }

    static void reverseArray(int[] arr) {
        for (int i = 0, j = arr.length; i < j; i++, j--) {
            swap(arr, i, j);
        }
    }

    static void reverseArray(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void removeDuplicatesFromSortedArray(int[] arr) {
        int cur = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[cur - 1] != arr[i]) {
                arr[cur] = arr[i];
                cur++;
            }
        }
    }

    static void moveZerosToEnd(int[] arr) {
        int nonZeroCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr, nonZeroCount, i);
                nonZeroCount++;
            }
        }
    }

    static void leftRotateByOne(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }

    static void leftRotateByDPlaces(int[] arr, int d) {
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, arr.length - 1);
        reverseArray(arr, 0, arr.length - 1);
    }

    static void leadersInAnArray(int[] arr) {
        int cur_leader = arr[arr.length - 1];
        System.out.println(cur_leader);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > cur_leader) {
                cur_leader = arr[i];
                System.out.println(cur_leader);
            }
        }
    }

    //max of a[i] - a[j] j > i
    static void maxDiff(int[] arr) {
        int maxDiff = arr[1] - arr[0];
        int curMin = arr[0];
        for (int i = 0; i < arr.length; i++) {
            maxDiff = Math.max(maxDiff, arr[i] - curMin);
            curMin = Math.max(arr[i], curMin);
        }
        System.out.println(maxDiff);
    }

    //last - first
    static void maxDiffInSortedArray(int[] arr) {

    }

    static void printFreqInSortedArray(int[] arr) {
        int i = 1;
        int freq = 1;
        while (i < arr.length - 1) {
            while (i < arr.length - 1 && arr[i - 1] == arr[i]) {
                freq++;
                i++;
            }
            System.out.format("i: %d freq: %d", arr[i - 1], freq);
            i++;
            freq = 1;
        }
        if (arr.length == 1 || arr[arr.length-1] != arr[arr.length-2]){
            System.out.format("i: %d freq: %d", arr[i - 1], freq);
        }
    }

    static void stockBuySell() {

    }

    static void trappingRainWater() {

    }

    static void maxConsecutive1s() {

    }

    static void maxSubArraySum() {

    }

    static void longestEvenOddSubarray() {

    }

    static void maxCircularSumSubarray() {

    }

    static void majorityElement() {

    }

    static void maxConsecutiveFlips() {

    }

    static void slidingWindowTechnique() {

    }

    static void prefixSum() {

    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
