package DSA.LinkedList;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(12));
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findsquare(n);
            fast = findsquare(findsquare(n));
        } while(fast != slow);

        if(slow == 1) {
            return true;
        }
        return false;
    }

    private static int findsquare(int number) {
        int ans = 0;
        while(number > 0) {
            int rem = number % 10;
            number /= rem;
            ans += rem * rem;
        }
        return ans;
    }
}
