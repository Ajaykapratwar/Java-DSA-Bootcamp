package DSA.Recursion.Lec_27;

public class Factorial {
    public static void main(String[] args) {
        int ans = factorial(6);
        System.out.println(ans);
    }

    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}
