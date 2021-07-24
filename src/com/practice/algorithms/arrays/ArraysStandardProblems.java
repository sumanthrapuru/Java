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
        if (arr.length == 1 || arr[arr.length - 1] != arr[arr.length - 2]) {
            System.out.format("i: %d freq: %d", arr[i - 1], freq);
        }
    }

    //
    static int maxProfitStockBuySell(int[] prices, int start, int end) {
        if (end <= start) return 0;
        int profit = 0;
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (prices[j] > prices[i]) {
                    int cur_profit = prices[j] - prices[i] +
                            maxProfitStockBuySell(prices, start, i - 1) +
                            maxProfitStockBuySell(prices, j + 1, end);
                    profit = Math.max(profit, cur_profit);
                }
            }
        }
        return profit;
    }

    static int maxProfitStockPrices(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

    //non negative bar length
    //array is increasing or decreasing 0 water collected
    static int trappingRainWater(int[] arr) {
//        naive solution
//        int res = 0;
//        for(int i = 1; i < arr.length-1; i++){
//            int lmax = arr[i];
//            for(int j = 0; j<i; j++){
//                lmax = Math.max(lmax, arr[i]);
//            }
//            int rmax = arr[i];
//            for(int j = i+1; j<arr.length; j++){
//                rmax= Math.max(rmax, arr[j]);
//            }
//            res = res + (Math.min(lmax, rmax) - arr[i]);
//        }
        //efficient sol: pre compute lmax rmax
        int length = arr.length;
        int res = 0;
        int[] lmax = new int[length], rmax = new int[length];
        lmax[0] = arr[0];
        for (int i = 1; i < length; i++) {
            lmax[i] = Math.max(arr[i], arr[i - 1]);
        }
        rmax[length - 1] = arr[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            rmax[i] = Math.max(arr[i], rmax[i + 1]);
        }
        for (int i = 1; i < length - 1; i++) {
            res = res + (Math.min(lmax[i], rmax[i]) - arr[i]);
        }
        return res;
    }

    //{0, 1, 1, 0, 1, 0} {1, 1, 1} {0,0,0}
    static int maxConsecutive1s(int[] arr) {
        int res = 0;
        int cur = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                cur = 0;
            } else {
                cur++;
                res = Math.max(res, cur);
            }
        }
        return res;
    }

    //{-3 8 -2 4 -5 6}
    static int maxSubArraySum(int[] arr) {
        int res = arr[0];
        int curMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            curMax = Math.max(curMax + arr[i], arr[i]);
            res = Math.max(res, curMax);
        }
        return res;
    }

    static int longestEvenOddSubarray(int[] arr) {
        int res = 1;
        int cur = 1;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) ||
                    (arr[i] % 2 == 0 && arr[i - 1] % 2 != 0)) {
                cur++;
                res = Math.max(res, cur);
            } else {
                cur = 1;
            }
        }
        return res;
    }

    static int maxCircularSumSubarray(int[] arr) {
        int max_normal = maxSubArraySum(arr);
        if (max_normal < 0) return max_normal;
        int arr_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr_sum += arr[i];
            arr[i] = -arr[i];
        }
        int max_circular = arr_sum + maxSubArraySum(arr);
        return Math.max(max_normal, max_circular);
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

