package DSA.Recursion.Lec_27;

public class Count_zeros {
    public static void main(String[] args) {
        int ans = counting(1020003680);
        System.out.println(ans);
    }

    public static int counting(int n) {
        if (n == 0) {
            return 1;
        }
        return countZeros(n);
    }

    private static int countZeros(int n) {
        if (n == 0) {
            return 0;
        }
        int rem = n % 10;
        int count = 0;
        if (rem == 0) {
            count++;
        }
        return count + countZeros(n / 10);
    }

}
