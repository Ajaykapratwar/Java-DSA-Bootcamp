import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] profit = {5, 11, 13};
        int[] weight = {2, 4, 6};
        System.out.println(unboundedKnapsack(3, 10, profit, weight));
    }

    static int[][] dp;

    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
        // Write your code here.
        dp = new int[n][w+1];

        for(int[] row: dp) {
            Arrays.fill(row, -1);
        }

        return solver(n-1, w, profit, weight);
    }

    public static int solver(int i, int target, int[] profit, int[] weight) {
        if(i == 0) {
            return (target / weight[0]) * profit[0];
        }

        if(dp[i][target] != -1) return dp[i][target];

        int notTake = solver(i-1, target, profit, weight);

        int take = 0;
        if(weight[i] <= target) {
            take = profit[i] + solver(i, target-weight[i], profit, weight);
        }

        dp[i][target] = Math.max(notTake, take);

        return dp[i][target];
    }
}
