package DSA.DynamicProgramming;

import java.util.Arrays;

public class FrogJumpK {

    public static void main(String[] args) {
        int[] heights = {10, 20, 30, 10};
        System.out.println(frogjump(heights.length, 1, heights));
    }

    public static int frogjump(int n, int k, int[] heights) {
        int[] dp = new int[heights.length];
        Arrays.fill(dp, -1);

        return counting(n - 1, k, heights, dp);
    }

    public static int counting(int ind, int k, int[] heights, int[] dp) {
        if(ind == 0) return 0;
        if(dp[ind] != -1) return dp[ind];
        int minSteps = Integer.MAX_VALUE;

        for(int i = 1; i <= k && ind - i >= 0; i++) {
            int jump = counting(ind - i, k, heights, dp) + Math.abs(heights[ind] - heights[ind - i]);
            minSteps = Math.min(minSteps, jump);
        }
        return dp[ind] =    minSteps;
    }

}
