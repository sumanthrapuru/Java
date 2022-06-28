package ds.array;

import java.util.Arrays;

public class PrintSubSetInSortedList {

    public static void main(String[] args) {
        int[] arr1 = {14, 2, 5, 8, 4, 0, 10};
        int[] arr2 = {9, 10, 3, 5, 4, 0};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        new PrintSubSetInSortedList().printSubSetInSortedList(arr1, arr2);
    }

    void printSubSetInSortedList(int[] arr1, int[] arr2){
        if(arr1 == null || arr1.length == 0 || arr2 == null || arr2.length == 0){
            return;
        }
        int i = 0;
        int j = 0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                System.out.println(arr1[i]);
                i++;
                j++;
            }else if(arr1[i] < arr2[j]){
                i++;
            }else {
                j++;
            }
        }
    }
}
