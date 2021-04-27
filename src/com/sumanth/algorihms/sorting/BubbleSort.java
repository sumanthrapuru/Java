package com.sumanth.algorihms.sorting;

/*
Bubble sort is stable: compares adjacent elements
Theta(N^2)
 */
public class BubbleSort {
    //big bubble surfaces first
    static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    //swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(new int[]{10, 20});
    }

}
