package com.sumanth.java.algorihms.sorting;

import java.util.Arrays;

/*
Divide conquer
stable
Theta(Nlog(N)) single processor random input
O(N) space
block merge sort NlogN in place
best for linked list, external sorting
for arrays quicksort
pearl merge
java8 quick merge
python timsort(merge + insertion)
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 5, 8, 7, 3, 1, 4, 9};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int mid = low + (high - low)/2;
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
    }

    private static void merge(int[] array, int low, int mid, int high) {
        int n1 = mid-low+1, n2 = high - mid;
        int[] left = new int[n1], right = new int[n2];
        for(int i = 0; i<n1; i++){
            left[i] = array[low+i];
        }
        for(int i=0; i<n2; i++){
            right[i] = array[mid+i+1];
        }

        int i = 0, j = 0, k = 0;
        while(i<n1 && j<n2){
            if(left[i] <= right[j]){
                array[low+k] = left[i];
                i++;
                k++;
            } else {
                array[low+k] = right[j];
                j++;
                k++;
            }
        }
        while(i < n1){
            array[low+k] = left[i];
            i++;
            k++;
        }
        while(j < n2){
            array[low+k] = right[j];
            j++;
            k++;
        }
    }

    void mergeTwoArrays(int[] a, int[] b) {
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if(a[i]<=b[j]){
                System.out.println(a[i]);
                i++;
            }
            else{
                System.out.println(b[j]);
                j++;
            }
        }
        while(i<a.length) {
            System.out.println(a[i]);
            i++;
        }
        while(j<b.length){
            System.out.println(a[j]);
            j++;
        }
    }
}
