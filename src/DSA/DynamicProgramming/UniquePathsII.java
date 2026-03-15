package DSA.DynamicProgramming;

import java.util.Arrays;

public class UniquePathsII {

    public static void main(String[] args) {
        int[][] grid = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePathsWithObstacles(grid));
    }

    public static int uniquePathsWithObstacles(int[][] grid) {
        int i = grid.length;
        int j = grid[0].length;
        int[][] dp = new int[i][j];

        for(int[] row : dp) Arrays.fill(row, -1);
        return solver(i-1, j-1, grid, dp);
    }

    public static int solver(int m, int n, int[][] grid, int[][] dp) {
        if(m < 0 || n < 0) return 0;
        if(grid[m][n] == 1) return 0;
        if(m == 0 && n == 0) return 1;

        if(dp[m][n] != -1) return dp[m][n];

        int up = solver(m - 1, n, grid, dp);
        int left = solver(m, n - 1, grid, dp);

        dp[m][n] = up+left;
        return up+left;
    }
}
