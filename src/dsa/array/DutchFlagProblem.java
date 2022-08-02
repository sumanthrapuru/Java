package dsa.array;

import java.util.Arrays;

public class DutchFlagProblem {

    // this will contain the values (0s, 1s and 2s)
    private int[] nums;

    public DutchFlagProblem(int[] nums) {
        this.nums = nums;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 0, 2, 1};
        new DutchFlagProblem(arr).solve();
        System.out.println(Arrays.toString(arr));
    }

    public void solve() {

        int endOf0 = 0;
        int i = 0;
        // we know that 1 is the middle item (0, 1, 2)
        int pivot = 1;
        int beginOf2 = nums.length - 1;
        while (i <= beginOf2) {
            if (nums[i] == pivot) {
                i++;
            } else if (nums[i] < pivot) {
                swap(i, endOf0);
                i++;
                endOf0++;
            } else if (nums[i] > pivot) {
                swap(i, beginOf2);
                beginOf2--;
            }
        }
    }

    private void swap(int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public void showResult() {
        System.out.println(Arrays.toString(nums));
    }
}
