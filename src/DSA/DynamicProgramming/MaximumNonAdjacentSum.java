package DSA.DynamicProgramming;

//https://leetcode.com/problems/house-robber/description/
//https://www.naukri.com/code360/problems/maximum-sum-of-non-adjacent-elements_843261?interviewProblemRedirection=true&search=maximum%20sum%20of%20

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumNonAdjacentSum {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        int[] arr = {1, 2, 3, 1, 3, 5, 8, 1, 9};

        for(int num : arr) nums.add(num);
        System.out.println(maximumNonAdjacentSum(nums));
    }

    public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
        int[] dp = new int[nums.size()];
        Arrays.fill(dp, -1);

        return counting(nums, dp, nums.size() - 1);
    }

    public static int counting(ArrayList<Integer> nums, int[] dp, int ind) {
        if(ind < 0) return 0;
        if(ind == 0) return nums.get(ind);

        if (dp[ind] != -1) return dp[ind];

        int pick = counting(nums, dp, ind - 2) + nums.get(ind);
        int non_pick = counting(nums, dp, ind - 1) + 0;

        return dp[ind] = Math.max(pick, non_pick);
    }

}
