package june27;

import java.util.Arrays;

public class Main10 {
    // {0,1,2,1,0,2,2,0,1,2,0,1,1,2,1,2,0,1}

    class Node{
        int value;
        Node next;
    }

    public static void main(String[] args) {
        new Main10().sort(new int[]{0,1,2,1,0,2,2,0,1,2,0,1,1,2,1,2,0,1});
    }

    void sort(int[] nums){//0 1 2
        int start = 0;
        int end = nums.length-1;
        int i;
        for( i = 0; i < end; i++){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[start++] = nums[i];
                //nums[i] = temp;
            } else if(nums[i] == 2) {
                int temp = nums[i];
                nums[end--] = nums[i];
                //nums[i] = temp;
            }
        }

        System.out.println(Arrays.toString(nums));
    }


}
