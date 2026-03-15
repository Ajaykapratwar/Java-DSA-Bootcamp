package DSA.DynamicProgramming;

import java.util.Arrays;

public class SubsetSumEqualK {
    public static void main(String[] args) {
        int n = 5, k = 12;
        int[] arr = {1, 7, 2, 9, 10};

        System.out.println(subsetSumToK(n, k, arr));
    }

    public static boolean subsetSumToK(int n, int k, int[] arr) {
        int[][] dp = new int[n][k + 1];

        for(int[] row : dp) Arrays.fill(row, -1);

        return solver(n-1, k, arr, dp);
    }

    public static boolean solver(int ind, int target, int[] arr, int[][] dp) {
        if(target == 0) return true;
        if(ind == 0) return arr[0] == target;

        if(dp[ind][target] != -1) return dp[ind][target] == 1;

        boolean notTake = solver(ind - 1, target, arr, dp);

        boolean take = false;
        if(arr[ind] <= target) take = solver(ind - 1, target - arr[ind], arr, dp);

        dp[ind][target] = (take || notTake) ? 1 : 0;

        return take || notTake;
    }
}
