package DSA.Recursion;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int a = Math.min(num1,num2);

        int ans = gcd(num1,num2,a);
        System.out.println(ans);
    }

    public static int gcd(int num1,int num2,int i) {
        if(num1 % i == 0 && num2 % i == 0) {
            return i;
        }
        return gcd(num1, num2, i-1);
    }
}
