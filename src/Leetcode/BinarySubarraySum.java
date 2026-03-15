package Leetcode;

//930. Binary Subarrays With Sum

//Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.
//A subarray is a contiguous part of the array.

public class BinarySubarraySum {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0};
        System.out.println(numSubarraysWithSum(arr, 0));
    }

    public static int numSubarraysWithSum(int[] arr, int goal) {
        int left = 0, right = 0, count = 0, n = arr.length;
        int sum = 0;

        for(left = 0; left < n; left++) {
            right = left;
            while(right < n) {
                sum += arr[right];
                if(sum == goal) {
                    count++;
                }
                right++;
            }
            sum = 0;
        }
        return count;
    }
}
