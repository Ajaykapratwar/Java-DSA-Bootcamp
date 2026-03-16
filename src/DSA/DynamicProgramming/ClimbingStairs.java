package DSA.DynamicProgramming;

// 70. Climbing Stairs
// You are climbing a staircase. It takes n steps to reach the top.
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n + 1];

        System.out.println(climbStairs(n, arr));
    }

    public static int climbStairs(int n, int[] arr) {
        if(n <= 2) return n;
        if(arr[n] != 0) return arr[n];
        int ans = climbStairs(n - 1, arr) + climbStairs(n - 2, arr);
        arr[n] = ans;
        return ans;
    }
}
