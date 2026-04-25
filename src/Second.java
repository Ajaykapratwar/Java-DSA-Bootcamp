import java.util.*;

public class Second {
    static long MOD = 1_000_000_007;
    static int N;
    static long[] A, B;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        long X = sc.nextLong();
        long Y = sc.nextLong();
        long Z = sc.nextLong();

        A = new long[N];
        B = new long[N];

        for (int i = 0; i < N; i++) A[i] = sc.nextLong();
        for (int i = 0; i < N; i++) B[i] = sc.nextLong();

        long ans = solve(0, X, Y, Z);
        System.out.println((ans % MOD + MOD) % MOD);
    }

    static long solve(int i, long X, long Y, long Z) {
        // Base case
        if (i == N) return 0;

        long res = Long.MIN_VALUE;

        // Option 1: subtract B[i]
        long op1 = -B[i] + solve(i + 1, X, Y, Z);
        res = Math.max(res, op1);

        // Option 2: decrease X and Y
        if (X > 0 && Y > 0) {
            long val = A[i] * X * Y * Z;
            long op2 = val + solve(i + 1, X - 1, Y - 1, Z);
            res = Math.max(res, op2);
        }

        // Option 3: decrease Y and Z
        if (Y > 0 && Z > 0) {
            long val = A[i] * X * Y * Z;
            long op3 = val + solve(i + 1, X, Y - 1, Z - 1);
            res = Math.max(res, op3);
        }

        return res;
    }
}