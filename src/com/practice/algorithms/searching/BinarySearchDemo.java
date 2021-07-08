package com.practice.algorithms.searching;

import java.util.function.Function;
import java.util.function.Predicate;

public class BinarySearchDemo {
    public int binarySearch(int[] arr, int element) {
        return binarySearch(arr, 0, arr.length - 1, element, true);
    }

    public int binarySearch(int[] arr, int start, int end, int element, boolean isFirstElementReq) {
        if (start > end) return -1;

        int mid = start + (end - start) / 2;
        int recFoundIndex;
        int foundIndex = -1;

        if (arr[mid] > element) {
            recFoundIndex = binarySearch(arr, start, mid - 1, element, isFirstElementReq);
        } else if (arr[mid] < element) {
            recFoundIndex = binarySearch(arr, mid + 1, end, element, isFirstElementReq);
        } else {
            int recStart;
            int recEnd;
            if (isFirstElementReq) {
                recStart = start;
                recEnd = mid - 1;
            } else {
                recStart = mid + 1;
                recEnd = end;
            }
            recFoundIndex = binarySearch(arr, recStart, recEnd, element, isFirstElementReq);
            foundIndex = mid;
        }
        if (foundIndex != -1 && recFoundIndex != -1) {
            return isFirstElementReq ? Math.min(foundIndex, recFoundIndex) : Math.max(foundIndex, recFoundIndex);
        } else if (foundIndex != -1) {
            return foundIndex;
        } else return recFoundIndex;
    }


    public int binarySearchItr(int[] arr, int element, boolean isFirstElementReq) {
        int start = 0;
        int end = arr.length;
        int mid;
        //check for repetition considering boundaries
        Predicate<Integer> isElementAsPerReq = (midIndex) -> {
            if (isFirstElementReq) {
                return midIndex == 0 || arr[midIndex - 1] < element;
            } else {
                return midIndex == arr.length - 1 || arr[midIndex + 1] > element;
            }
        };
        while (!(start > end)) {
            mid = start + (end - start) / 2;
            if (arr[mid] > element) {
                end = mid - 1;
            } else if (arr[mid] < element) {
                start = mid + 1;
            } else if (arr[mid] == element) {
                if (isElementAsPerReq.test(mid)) {
                    return mid;
                } else {
                    if (isFirstElementReq) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //int index = new BinarySearchDemo().binarySearch(new int[]{1, 1, 2, 2, 4, 5}, 2);
        int index = new BinarySearchDemo().binarySearchItr(new int[]{1, 2, 2, 4, 5}, 2, true);
        System.out.println(index);
    }
}
