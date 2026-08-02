package DSA.Assignments.Array;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};           //[1,3,6,10]
        int[] sum = new int[nums.length];
        RunningSum solution = new RunningSum();
        int[] runningsum = solution.runningsum(nums,sum);

//        for(int num : runningsum) {
//            System.out.println(num+" ");
//        }
        System.out.println(Arrays.toString(runningsum));
    }

    public int[] runningsum(int[] nums,int[] sum) {
        sum[0] = nums[0];
        for(int i=1;i<nums.length;i++) {
            sum[i] = sum[i - 1] +nums[i];
        }
        return sum;
    }
}
