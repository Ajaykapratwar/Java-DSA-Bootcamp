package DSA.DynamicProgramming;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n + 1];

//        System.out.println(fibo(n, arr));
        System.out.println(fibo_tabulation(n, arr));
    }

    // using memoization
    
    public static int fibo(int n, int[] arr) {
        if(n <= 1) return n;
        if(arr[n] != 0) return arr[n];
        int ans = fibo(n - 1, arr) + fibo(n - 2, arr);
        arr[n] = ans;
        return ans;
    }

    // using tabulation
    public static int fibo_tabulation(int n, int[] arr) {
        arr[0] = 0;
        if (n > 0) arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }

}


/*

normal solution that takes O(2^n) complexity to solve.

class Solution {
    public int fib(int n) {
        if(n == 0 || n == 1) return n;

        return fib(n - 1) + fib(n - 2);
    }
}
*/
