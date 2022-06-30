package interview2;

import java.util.Stack;

public class Main14 {
    public static void main(String[] args) {
        int[][] arr =
                {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}};
        printPath(arr, 4, 5, 0, 0);
        for(int i : maxSumElements){
            System.out.print(i+" ");
        }
    }

    static Stack<Integer> stack = new Stack<>();
    static int maxSum = Integer.MIN_VALUE;
    static Stack<Integer> maxSumElements = new Stack<>();

    //1 2 3 4 5 10 15 20
    static void printPath(int[][] arr, int m, int n, int x, int y) {
        if (x >= m || y >= n) {
            return;
        }
        if (x == m - 1 && y == n - 1) {
            stack.push(arr[x][y]);
            int totalSum = 0;
            for (int i : stack) {
                totalSum += i;
            }
            if (maxSum < totalSum) {
                maxSum = totalSum;
                for (int i = 0; i < stack.size(); i++) {
                    maxSumElements.push(stack.get(i));
                }
            }
            stack.pop();
            return;
        }

        stack.push(arr[x][y]);

        printPath(arr, m, n, x + 1, y);
        printPath(arr, m, n, x, y + 1);
        printPath(arr, m, n, x + 1, y + 1);

        stack.pop();
    }
}
