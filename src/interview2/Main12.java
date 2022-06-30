package interview2;

public class Main12 {

    //

    public static void main(String[] args) {
        int[] nums = new int[]{8, 5, 7, 1};
        int index = new Main12().find(nums);
        if(index != -1){
            System.out.println("equilibrium "+index);
        }
    }

    int find(int[] nums){
        int totalSum = 0;
        for(int i : nums) totalSum += i;
        int leftSum = 0;
        for(int i = 0; i < nums.length; i++){
            if(leftSum == totalSum - (leftSum + nums[i])){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }


    /*
    * Given an arbitrary binary tree, convert it to a binary tree that holds Children Sum Property.
(You cannot change the structure of the tree).
*
*                  10
*                   \
*                7       3
*               /       /
*              5      3
*                \
*                  7
*
    * */

    class Node{
        int value;
        Node left, right;
    }

    void fixTree(Node root){
        if(root == null || (root.left == null && root.right == null)){
            return;
        }
        fixTree(root.left);
        fixTree(root.right);

        root.value = (root.left == null ? 0 : root.left.value) +
                (root.right == null ? 0 : root.right.value);

    }

}
