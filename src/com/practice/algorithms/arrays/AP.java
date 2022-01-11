package com.practice.algorithms.arrays;

import java.time.LocalDate;
import java.util.Arrays;

public class AP {

    public int largestElement(int[] arr){
        if(arr == null || arr.length == 0) return -1;

        int largestElement=arr[0];

        for(int i=1; i<arr.length;i++){

            if(arr[i]>largestElement){
                largestElement = arr[i];
            }

        }
        return largestElement;
    }


    //{5, 4, 2, 8},{2,3,10,1,5},{1,1,1,1,1}
    public int secondLargest(int[] arr){
        if(arr == null || arr.length == 0) return -1;
        int largest = arr[0];
        int secondLargest = -1;
        for(int i=1; i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }else if(arr[i] < largest){
                if(secondLargest == -1 || arr[i] > secondLargest) {
                    secondLargest = arr[i];
                }
            }

        }
        return secondLargest;
    }

    //{1,2,3,4}
    public boolean isSorted(int[] a){
        for(int i = 1; i < a.length; i++){
            if(a[i-1] > a[i]) return false;
        }
        return true;
    }

    public void reverseArray(int[] a){
        for(int i = 0, j = a.length-1; i < j; i++, j--){
            swap(a, i, j);
        }
    }

    public void removeDuplicates(int[] a){

    }

    //{-10, 4, -2, 3, -8}
    public void maxSubarray(int[] a){

    }



















    


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        new AP().reverseArray(a);
//        System.out.println(Arrays.toString(a));
        //dateOfBirth.isAfter(today.minusYears(64)) && dateOfBirth.isBefore(today.minusYears(25))
        System.out.println(LocalDate.now().minusYears(64));
        //System.out.println(new LocalDate(-391696776000L));
    }

    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
