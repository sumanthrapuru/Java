package interview2;

import java.util.ArrayList;
import java.util.List;

public class Main6 {
    //{14,6,11,7,8,5,3} -> {14,11,8,5,3}


    public static void main(String[] args) {
        new Main6().leaders(new int[]{14,6,11,7,8,5,3});
    }
    int[] leaders(int[] nums){
        List<Integer> list = new ArrayList<>();//3,4,8,11,14
        list.add(nums[nums.length-1]);
        int soFarBig = nums[nums.length-1];
        for(int i = nums.length-2; i >= 0; i--){
            if(nums[i] > soFarBig){
                list.add(nums[i]);
                soFarBig = nums[i];
            }
        }
        System.out.println(list);
        int[] temp = new int[list.size()];
        return temp;
//        for(int)
    }
}
