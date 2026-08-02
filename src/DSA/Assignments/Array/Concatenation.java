package DSA.Assignments.Array;

import java.util.Arrays;

public class Concatenation {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        int n = nums.length;
        int[] ans = new int[2* nums.length];

        Concatenation solution = new Concatenation();
        int[] cocantedarray = solution.getConcatenation(nums,ans,n);
    }

//    Given an integer array nums of length n, you want to create an array ans of length 2n where
//    ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

    public int[] getConcatenation(int[] nums,int[] ans,int n) {
        for(int i=0;i<nums.length;i++) {
            ans[i] = nums[i];
            ans[i+n] =nums[i];
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
