package com.sumanth.algorihms.sorting;
/*
un stable: selects max element, swaps max element with last element(thus disturbing original order)
less memory swaps compared with quick, merge, insertion
cycle sort is less memory swaps than selection sort
eeprom more writes less life, writing to hard disk
Theta(N^2)
 */
public class SelectionSort {
    static void selectionSort(int[] array){
        int n = array.length - 1;
        for(int i = 0; i < n - 1; i++){
            int min = i;
            for(int j = i+1; j < n; j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }
            //swap
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
