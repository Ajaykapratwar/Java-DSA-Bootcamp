package HackWithInfy;

public class First {
    public static void main(String[] args) {

    }

    public static long solve(int n, int[] A, int[][] query) {
        long MOD = 1000000007L;
        long totalSum = 0;
        long[] arr = new long[n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = A[i - 1];
        }

        for(int[] q : query) {
            int type = q[0];
            int l = q[1];
            int r = q[2];

            if(type == 1) {
                long base = arr[l];
                for (int i = l; i <= r; i++) {
                    arr[i] = ((long)(i - l + 1) * base) % MOD;
                }
            }
            if(type == 2) {
                long sum = 0;
                for(int i = l; i <= r; i++) sum = (sum + arr[i]) % MOD;
                totalSum = (totalSum + sum) % MOD;
            }
        }
        return totalSum % MOD;
    }
}
