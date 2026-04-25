import java.util.*;

public class First {
    static final long MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] A = new long[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextLong();
        }

        int q = sc.nextInt();

        while (q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            long x = sc.nextLong();
            long y = sc.nextLong();

            // Apply query (brute force)
            for (int i = l; i <= r; i++) {
                A[i] = (x + (i - l) * y) % MOD;
            }
        }

        // Calculate final sum
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (sum + A[i]) % MOD;
        }

        System.out.println(sum);
    }
}