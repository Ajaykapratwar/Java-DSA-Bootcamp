package DSA.SlidingWindow;

public class MaximumSumSubarraySizeK {
    public static void main(String[] args) {
        int[] arr = {-5, -2, -3, -4};
        int n = arr.length;
        int maxSum = 0;
        int k = 2;
    
        int l = 0, r = k - 1, sum = 0;
        for(int a = l; a <= r; a++) {
            sum += arr[a];
        }
        l++;
        r++;

        maxSum = sum;

        while(r < n) {
            sum = sum - arr[l - 1] + arr[r];
            maxSum = Math.max(maxSum, sum);
            l++;
            r++;
        }
        System.out.println(maxSum);
    }
}
