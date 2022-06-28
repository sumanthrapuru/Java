package ds.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KoperationsMaxSameElemens {
    public static void main(String[] args) {
        int[] input = {1, 3, 4}; //k=5
        //1 {2,3,4}
        //2 {3,3,4}
        //3 {4,3,4}
        //4 {4,4,4} 3
        //5 {5, 4, 4} 2

        //{1, 10, 20} //k 3 1
        //{2, 8, 10, 11, 12, 20} //k 10 3

        find(new int[]{2, 8, 10, 11, 12, 20}, 10);

        //int num = 53412; //53421  54123 54132 54213 54231
        String s = "53412";
        int[] arr = new int[s.length()];
        for (char c : s.toCharArray()) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Character.getNumericValue(c);
            }
        }


        //nextMax("53412".toCharArray());

    }

    static void nextMax(int[] arr) {
        List list = new ArrayList<>();
        for(int i = arr.length-2; i>=0; i--){
            if(arr[i] < arr[i+1]){

            }
            list.add(arr[i]);
        }
    }

    static void find(int[] nums, int k) {
        //handle edge case
        Arrays.sort(nums);
        int totalMax = 1;

        for (int x = 0; x < nums.length; x++) {
            int sum = nums[x];
            int max = 1;
            for (int i = x + 1; i < nums.length; i++) {
                sum += nums[i];
                int diff = (nums[i] * ((i + 1 - x))) - sum;
                System.out.println("x : " + x + " i : " + i + " sum : " + sum + " diff : " + diff + " max : " + max + " totalMax : " + totalMax);
                if (k >= diff) {
                    //k -= diff;
                    max = Math.max(max, i + 1 - x);
                }

            }
            sum = 0;
            totalMax = Math.max(max, totalMax);
        }
        System.out.println(totalMax);
    }
}
