package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo13 {

    //Write a program to remove duplicates in an ArrayList.

    public static void main(String[] args) {
//        removeDuplicates(new ArrayList<>(Arrays.asList(3,9, 5,7, 5, 3, 8, 5, 9)));
//        System.out.println(new Demo13().reverse2("sumanth"));
        System.out.println(Arrays.toString(new Demo13().moveZeros(new int[]{14, 0, 5, 2, 0, 3, 0})));
    }

    static void removeDuplicates(ArrayList<Integer> list){

        Set<Integer> set = new HashSet<>();
        int fillIndex = 0;
        for(int i = 0; i < list.size(); i++){

            if(set.contains(list.get(i))){
                //fillIndex = i;

            }else{
                set.add(list.get(i));
                list.set(fillIndex, list.get(i));
                fillIndex++;
            }
        }

        for(int i = 0; i < fillIndex; i++){
            System.out.print(list.get(i)+" ");
        }
    }

    String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() -1; i >= 0; i--){
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }

    String reverse2(String s){
        char[] arr = s.toCharArray();
        for(int i = 0, j = arr.length-1; i < j; i++, j--){
            char temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }

        return new String(arr);
    }


    /**
     * You have to move zeros either to end of the array or bring them to beginning of the array.
     *
     * For example, if {14, 0, 5, 2, 0, 3, 0} is the given array, then moving zeros to end of the array will
     * result {14, 5, 2, 3, 0, 0, 0} and bringing zeros to front will result {0, 0, 0, 14, 5, 2, 3}.
     */

    int[] moveZeros(int[] arr){//beginning
        int zeroIndex = -1;
        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] != 0){
                if(zeroIndex != -1){
                    int temp = arr[i];
                    arr[i] = 0;
                    arr[zeroIndex] = temp;
                    if(arr[zeroIndex -1] == 0 ){
                        zeroIndex--;
                    }else
                        zeroIndex = i;
                }
                continue;
            }
            if(arr[i] == 0){
                if(zeroIndex == -1){
                    zeroIndex = i;
                }
            }
        }
        return arr;
    }

}
