package interview;

public class Demo5 {

    public static void main(String[] args) {
        largest(new int[]{-1, -2});
    }

    static int largest(int[] nums){
        if(nums.length == 0){
            return -1;
        }
        int maxResult = nums[0];
        int result = nums[0];
        for(int i = 1; i < nums.length; i++){
            result += nums[i];
            if(result < nums[i]){
                result = nums[i];
            }
            maxResult = Math.max(result, maxResult);
        }

        return Math.max(result, maxResult);
    }

    static int largestLeetcode(int[] nums){
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;

        for(int i=0;i<n;i++){
            sum += nums[i];
            max = Math.max(sum,max);

            if(sum<0) sum = 0;
        }

        return max;
    }
}
