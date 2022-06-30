package interview2;//package org.example;
//
//
//import java.util.Arrays;
//
//public class Main7 {
//    public static void main(String[] args) {
//        int[] arr = {1,2,1,0,1,0};
//        sort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    static void sort(int[] arr){
//        int j = 0, k = arr.length-1;
//        for(int i = 0; i <= k; ){
//
//            if(arr[i] == 0){
//                int value = arr[j];
//                arr[j++] = 0;
//                arr[i] = value;
//            }else if(arr[i] == 2){
//                int value = arr[k];
//                arr[k--] = 2;
//                arr[i] = value;
//
//            }else
//            i++;
//        }
//        while(j <= k){
//            arr[j++] = 1;
//        }
//    }
//}
//
//
//
//
///**
// * longest substring in two diff strings
// */
//}