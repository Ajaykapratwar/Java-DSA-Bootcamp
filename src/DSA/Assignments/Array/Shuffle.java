package DSA.Assignments.Array;

import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7}; // Expected output: [2, 3, 5, 4, 1, 7]
        int n = nums.length / 2;
        Shuffle solution = new Shuffle();
        int[] result = solution.shuffle(nums, n);
        System.out.println(Arrays.toString(result));
    }

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        for (int i = 0; i < n; i++) { // n=3
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }
        return result;
    }
}
