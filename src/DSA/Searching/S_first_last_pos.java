package DSA.Searching;

import java.util.Arrays;

// find the first and last position od element in the array.

public class S_first_last_pos {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 7;
        int[] a = new int[2];
        a = searchRange(arr,target);
        System.out.println(Arrays.toString(a));
    }

    public static int[] searchRange(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;

        while(start <= end) {
            int mid = (start + end) / 2;
            if(target == arr[mid]) {
                ans[0]=mid;
                end = mid - 1;
            }
            else if(target < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        start = 0;
        end = n-1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(target == arr[mid]) {
                ans[1] = mid;
                start = mid + 1;
            }
            else if(target < arr[mid]) {
                end = end - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
