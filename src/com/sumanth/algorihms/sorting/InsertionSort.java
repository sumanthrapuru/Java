package com.sumanth.algorihms.sorting;

/*
inplace
stable
O(N^2)
O(N)best
O(1) space, no functional calls
used in Timsort(merge+insertion), Introsort(heap,quick,insertion)
 */
public class InsertionSort {
    static void insertionSort(int[] array){
        for(int i = 1; i < array.length; i++){
            int curValue = array[i];
            int j = i-1;
            while(j >= 0 && array[j] > curValue){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = curValue;
        }
    }
}
