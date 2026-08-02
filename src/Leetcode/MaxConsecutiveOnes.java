package Leetcode;

//1004. Max Consecutive Ones III
//Given a binary array nums and an integer k, return the maximum number of consecutive
//1's in the array if you can flip at most k 0's.

import java.util.HashMap;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }

    public static int longestOnes(int[] nums, int k) {
        int left = 0, right = 0, maxLen = 0, n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        while( right < n) {
            if(nums[right] == 1) {
                if(!map.containsKey(nums[right])) {
                    map.put(nums[right], 1);
                }
                else {
                    int freq = map.get(nums[right]);
                    map.replace(nums[right], freq + 1);
                }
            }
            if(nums[right] == 0) {
                if(!map.containsKey(nums[right])) {
                    map.put(nums[right], 1);
                }
                if(map.get(nums[right]) == 2) {
                    maxLen = right - left + 1;
                    left++;
                }
                else {
                    int freq = map.get(nums[right]);
                    map.replace(nums[right], freq + 1);
                }
            }
            right++;
        }
        return maxLen;
    }
}
