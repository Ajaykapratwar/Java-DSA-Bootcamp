package DSA.Recursion.Lec_27;

public class Reverse_num {

    // 1st way

    static int sum = 0;
    public static void reverse(int n) {
        if(n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse(n / 10);
    }

    public static void main(String[] args) {
        reverse(5624);
        System.out.println(sum);
    }
}
