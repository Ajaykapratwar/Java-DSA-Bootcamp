package DSA.DynamicProgramming;

/*
2nd DP Problem from TUF DSA Sheet not on leetcode
 https://youtu.be/EgG3jsGoPvQ?si=_G-Dig_YPSnczuXs
*/

import java.util.Arrays;

public class FrogJump {

    public static void main(String[] args) {
        int[] heights = {10, 20, 30, 10};
        int ans = frogJump(heights.length, heights);
        System.out.println(ans);
    }

//    tabulation method
//    public static int frogJump(int n, int heights[]) {
//        int[] dp = new int[heights.length];
//
//        for(int i = 1; i < heights.length; i++) {
//            int fs = dp[i - 1] + Math.abs(heights[i] - heights[i - 1]);
//            int ss = Integer.MAX_VALUE;
//            if(i > 1) {
//                ss = dp[i - 2] + Math.abs(heights[i] - heights[i - 2]);
//            }
//            dp[i] = Math.min(fs, ss);
//        }
//
//        return dp[n - 1];
//    }

//    memoization method
    public static int frogJump(int n, int[] heights) {
        int[] dp = new int[heights.length + 1];
        Arrays.fill(dp, -1);

        return counting(n - 1, heights, dp);
    }

    public static int counting(int ind, int[] heights, int[] dp) {
        if(ind == 0) return 0;

        if(dp[ind] != -1) return dp[ind];
        int left = counting(ind - 1, heights, dp) + Math.abs(heights[ind] - heights[ind - 1]);
        int right = Integer.MAX_VALUE;
        if(ind > 1) {
            right = counting(ind - 2, heights, dp) + Math.abs(heights[ind] - heights[ind - 2]);
        }
        return dp[ind] = Math.min(left, right);
    }

}
