package PW.Recursion;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(3, 9));
    }

    public static int power(int a, int b) {
        if(b == 1) {
            return a;
        }
        if (b == 0) {
            return 1;
        }
        int ans = power(a, b/2);
        if(b % 2 == 0) {
            return ans * ans;
        }
        else {
            return ans * ans * a;
        }
    }
}
