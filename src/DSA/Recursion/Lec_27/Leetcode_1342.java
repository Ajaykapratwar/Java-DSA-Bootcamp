package DSA.Recursion.Lec_27;

public class Leetcode_1342 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
    static int count = 0;
    public static int numberOfSteps(int n) {
        int a = 0;
        if(n == 0) {
            return 0;
        }
        if(n % 2 == 0) {
            count++;
            return 1+numberOfSteps(n / 2);
        }
        return 1+numberOfSteps((n - 1));
    }
}
