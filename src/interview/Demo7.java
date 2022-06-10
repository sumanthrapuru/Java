package interview;

import java.util.Arrays;

public class Demo7 {


    //selection sort

    public static void main(String[] args) {
        int[] nums = new int[]{8, 10, 2, 3, 11, 12};
        new Demo7().mergeSort(nums, 0, nums.length-1);

        System.out.println(Arrays.toString(nums));
    }



    void mergeSort(int[] nums, int start, int end){
        if(start >= end){
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(nums, start, mid);//sorted array
        mergeSort(nums, mid+1, end);//0 1
        merge(nums, start, mid, end);

    }

    void merge(int[] nums, int start, int mid, int end){//0 1 2 3 4 5 6
        int[] left = new int[mid-start+1];
        int[] right = new int[end-mid];
        for(int i = 0; i < left.length; i++){
            left[i] = nums[start+i];
        }
        for(int i = 0; i < right.length; i++){
            right[i] = nums[mid+1+i];
        }

        int leftIndex = 0;
        int rightIndex = 0;
        int numsIndex = start;

        while(leftIndex < left.length && rightIndex < right.length){
            if (left[leftIndex] <= right[rightIndex]) {
                nums[numsIndex] = left[leftIndex];
                leftIndex++;
                numsIndex++;
            }else{
                nums[numsIndex] = right[rightIndex];
                rightIndex++;
                numsIndex++;
            }
        }
        while(leftIndex < left.length){
            nums[numsIndex] = left[leftIndex];
            leftIndex++;
            numsIndex++;
        }

        while(rightIndex < right.length){
            nums[numsIndex] = right[rightIndex];
            rightIndex++;
            numsIndex++;
        }

    }
}
