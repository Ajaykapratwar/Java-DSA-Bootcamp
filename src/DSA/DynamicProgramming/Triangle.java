package DSA.DynamicProgramming;

//https://leetcode.com/problems/triangle/description/

import java.util.Arrays;
import java.util.List;

public class Triangle {

    public static void main(String[] args) {
        List<List<Integer>> triangle = List.of(
                List.of(2),
                List.of(3, 4),
                List.of(6, 5, 7),
                List.of(4, 1, 8, 3)
        );

        System.out.println(minimumTotal(triangle));
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int[][] dp = new int[m][];

        for (int i = 0; i < m; i++) {
            dp[i] = new int[triangle.get(i).size()];
            Arrays.fill(dp[i], -1);
        }

        int ans = Integer.MAX_VALUE;
        for(int j = 0; j < triangle.get(m - 1).size(); j++) {
            ans = Math.min(ans, solver(m - 1, j, triangle, dp));
        }

        return ans;
    }

    public static int solver(int i, int j, List<List<Integer>> triangle, int[][] dp) {
        if (i < 0 || j < 0 || j >= triangle.get(i).size()) return Integer.MAX_VALUE;
        if(i == 0 && j == 0) return triangle.get(0).get(0);
        if(dp[i][j] != -1) return dp[i][j];

        int diagonal = solver(i-1, j-1, triangle, dp);
        int up = solver(i - 1, j, triangle, dp);

        dp[i][j] = triangle.get(i).get(j) + Math.min(diagonal, up);

        return dp[i][j];
    }
}
