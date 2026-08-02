package HackWithInfy;

public class First {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {1, 4, 5, 1, 6, 7, 8};
        int q = 5;
        int[][] queries = {{1,1,6}, {1,1,5}, {2,5,5}, {2,3,4}, {2,3,3}};
        System.out.println(solve(n, arr, queries));
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
