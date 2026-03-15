package DSA.DynamicProgramming;

//https://leetcode.com/problems/unique-paths/

import java.util.Arrays;
import java.util.Scanner;

public class UniquePath {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        System.out.println(uniquePaths(m, n));
    }

    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for(int[] row : dp) Arrays.fill(row, -1);

        return solver(m - 1, n - 1, dp);
    }

    public static int solver(int m, int n, int[][] dp) {
        if(m == 0 && n == 0) return 1;

        if(m < 0 || n < 0) return 0;

        if(dp[m][n] != -1) return dp[m][n];

        int up = solver(m - 1, n, dp);
        int left = solver(m, n - 1, dp);

        dp[m][n] = up+left;
        return dp[m][n];
    }
}
