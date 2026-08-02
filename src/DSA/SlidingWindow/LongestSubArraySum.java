package DSA.SlidingWindow;

import java.util.Arrays;

public class LongestSubArraySum {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 10, 10, 2, 3, 8, 4, 5, 1, 1, 2};
        System.out.println(longestsubarray(arr, 14));
    }

//  optimal solution
    public static int longestsubarray(int[] arr, int k) {
        int l = 0, r = 0, sum = 0, n = arr.length, maxLen = 0;

        int a = 0, b = 0;
        while(r < n) {
            sum += arr[r];
            if(sum > k) {
                sum -= arr[l];
                l++;
            }
            if(sum <= k) {
                maxLen = Math.max(maxLen, r - l + 1);
            }
            r++;
        }

        return maxLen;
    }

/*  Better Solution
    public static int[] longestsubarray(int[] arr, int k) {
        int l = 0, r = 0, sum = 0, n = arr.length, maxLen = 0;

        int a = 0, b = 0;
        while(r < n) {
            sum += arr[r];
            while(sum > k) {
                sum -= arr[l];
                l++;
            }
            if(sum <= k) {
                if((r - l + 1) >= maxLen) {
                    maxLen = r - l + 1;
                    a = l;
                    b = r;
                }
            }
            r++;
        }
        if (a == -1) return new int[0];

        return Arrays.copyOfRange(arr, a, b + 1);
    }

    Brute Force approach
    public static int longestsubarray(int[] arr, int k) {
        int maxLen = 0, n = arr.length;
        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = 0; j < n; j++) {
                sum += arr[j];
                if(sum <= k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
                if(sum > k) {
                    break;
                }
            }
        }
        return maxLen;
    }
 */
}
