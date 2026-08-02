package DSA.Recursion;

import java.util.Scanner;

public class Fibonacci_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();
        int ans = fibo(n);
        System.out.println(ans);
    }

    static int fibo(int n) {
        if(n < 2) {
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
}
