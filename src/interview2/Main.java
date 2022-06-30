package interview2;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
//        new Main().findSumNums(new int[]{1, 5, 2, 7, 3, 9}, 10);
        boolean found = new Main().find(new int[]{1, 2, 3, 6, 8, 9}, 30);
        if(found)
            System.out.println("found");
        else
            System.out.println("not found");

        //1235
        //2468
        //

    }

    boolean find(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;


        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    void findSumNums(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(target - nums[i])) {
                System.out.printf("no are %d %d \n", nums[i], target - nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
    }


}