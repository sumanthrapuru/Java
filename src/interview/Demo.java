package interview;

public class Demo {
    /*

    Sample:
Input: nums = [5,2,2,4,0,6], k = 4
Output: 5

Input: nums = [1,2,2,4,0,6], k = 4
Output: 4

n = 0 op: -1
k = 0 op: nums[0] != -1


    Maximize the Topmost Element After K Moves
You are given a 0-indexed integer array nums representing the contents of a pile, where nums[0] is the topmost element of the pile.

In one move, you can perform either of the following:

If the pile is not empty, remove the topmost element of the pile.
If there are one or more removed elements, add any one of them back onto the pile. This element becomes the new topmost element.
You are also given an integer k, which denotes the total number of moves to be made.

Return the maximum value of the topmost element of the pile possible after exactly k moves. In case it is not possible to obtain a non-empty pile after k moves, return -1.
     */

    static int getTopMost(int[] nums, int k){
        if(nums.length == 0 || (nums.length == 1 && k % 2 == 1)){
            return -1;
        }
        if(k == 0){
            return nums[0];
        }

        int maxIndex = Math.min(nums.length, k);
        int maxValue = nums[0];

        for(int i = 1; i < maxIndex; i++){
            if(nums[i] > maxValue) {
                maxValue = nums[i];
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        System.out.println(getTopMost(new int[]{3}, 1));
        System.out.println(getTopMost(new int[]{3}, 2));
        System.out.println(getTopMost(new int[]{3}, 3));
        System.out.println(getTopMost(new int[]{3}, 4));
        System.out.println(getTopMost(new int[]{3}, 5));

        //k= 1  -1
        //k= 2  3
        // 3    -1
        // 4    3
        // 5    -1
    }


}
