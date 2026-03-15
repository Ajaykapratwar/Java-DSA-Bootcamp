package DSA.DynamicProgramming;

import java.util.Arrays;

public class MinimumPathSum {

    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};

        System.out.println(minPathSum(grid));
    }

    public static int minPathSum(int[][] grid) {
        int i = grid.length;
        int j = grid[0].length;

        int[][] dp = new int[i][j];
        for(int[] row : dp) Arrays.fill(row, -1);

        return solver(i-1, j-1, grid, dp);
    }

    public static int solver(int i, int j, int[][] grid, int[][] dp) {
        if(i == 0 && j == 0) return grid[0][0];
        if(i < 0 || j < 0) return Integer.MAX_VALUE;

        if(dp[i][j] != -1) return dp[i][j];

        int up = solver(i - 1, j, grid, dp);
        int left = solver(i, j -1, grid, dp);

        dp[i][j] = grid[i][j] + Math.min(up, left);

        return dp[i][j];
    }
}
