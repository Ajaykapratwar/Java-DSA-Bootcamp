package DSA.Recursion.Lec_27;

public class Sum_N_to_1 {
    public static void main(String[] args) {
        int ans = sum(450);
        System.out.println(ans);
    }

    public static int sum(int n) {
        if(n == 1) {
            return 1;
        }
        return n + sum(n-1);
    }
}
