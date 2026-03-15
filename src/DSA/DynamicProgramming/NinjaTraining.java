package DSA.DynamicProgramming;

import java.util.Arrays;

public class NinjaTraining {

    public static void main(String[] args) {
        int n = 3;
        int[][] points = {{10,40,70}, {20, 50, 80}, {30, 60, 90}};
        System.out.println(ninjaTraining(n, points));
    }

    public static int ninjaTraining(int n, int[][] points) {
        int[][] dp = new int[n][4];

        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return helper(n-1, 3, points, dp);
    }

    public static int helper(int day, int last, int[][] points, int[][] dp) {
        if(day == 0) {
            int max = 0;
            for(int i = 0; i < 3; i++) {
                if(i != last) {
                    max = Math.max(max, points[0][i]);
                }
            }
            return dp[day][last] = max;
        }
        if(dp[day][last] != -1) return dp[day][last];

        int max = 0;
        for(int i = 0; i < 3; i++) {
            if(i != last) {
                int value = points[day][i] + helper(day-1, i, points, dp);
                max = Math.max(max, value);
            }
        }
        return dp[day][last] = max;
    }
}
