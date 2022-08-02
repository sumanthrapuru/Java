package dsa.array;

public class TrappedRainProblem {

    public int solve(int[] heights) {

        if (heights.length < 3)
            return 0;

        int[] leftMax = new int[heights.length];
        int[] rightMax = new int[heights.length];

        leftMax[0] = 0;
        rightMax[rightMax.length - 1] = 0;

        for (int i = 1; i < leftMax.length; ++i)
            leftMax[i] = Math.max(leftMax[i - 1], heights[i - 1]);

        for (int i = rightMax.length - 2; i >= 0; --i)
            rightMax[i] = Math.max(rightMax[i + 1], heights[i + 1]);

        int trapped = 0;
        for (int i = 1; i < heights.length - 1; i++) {//do not consider first, last
            int min = Math.min(leftMax[i], rightMax[i]);
            if (min > heights[i])
                trapped += min - heights[i];
        }

        return trapped;
    }
}
