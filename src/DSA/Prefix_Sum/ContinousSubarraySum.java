package DSA.Prefix_Sum;

// leetcode 523

import java.util.HashMap;
import java.util.Map;

public class ContinousSubarraySum {
    public static void main(String[] args) {
        int[] nums = {23,2,6,4,7};
        int k = 13;

        System.out.println(checkSubarraySum(nums, k));
    }

    public static boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int runningSum = 0;

        for(int i = 0; i < nums.length; i++) {
            runningSum = (runningSum + nums[i]) % k;

            if(!map.containsKey(runningSum)) {
                map.put(runningSum, i);
            } else if(i - map.get(runningSum) > 1) {
                return true;
            }
        }
        return false;
    }
}
