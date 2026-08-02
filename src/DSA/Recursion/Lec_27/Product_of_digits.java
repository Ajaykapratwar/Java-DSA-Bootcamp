package DSA.Recursion.Lec_27;

public class Product_of_digits {
    public static void main(String[] args) {
        int ans = sum(54218);
        System.out.println(ans);
    }

    public static int sum(int n) {
        if(n <= 0) {
            return 1;
        }
        int a = n % 10;
        return a * sum(n / 10);
    }
}
