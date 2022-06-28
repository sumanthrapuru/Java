package corejava;

import java.util.Arrays;

public class ArraysExample {
    void add2Begining(int[] arr){
        int[] newArray = new int[arr.length+1];
        newArray[0] = -1;
        System.arraycopy(arr, 0, newArray, 1, arr.length);
    }
}
