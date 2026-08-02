package Leetcode;

// https://leetcode.com/problems/find-peak-element/
// https://leetcode.com/submissions/detail/1416096656/

public class Peak_Mountain_Array {
    public static void main(String[] args) {
        int[] arr = {1};
        int ans = peak(arr);
        System.out.println(ans);
    }

    public static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(mid < arr.length - 1) {
                if(arr[mid] < arr[mid-1] ) {
                    end = mid;
                }
                else if(arr[mid] < arr[mid+1]) {
                    start = mid;
                }
                else {
                    return mid;
                }
            }
        }
        return -1;




        /*
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = (start + end) / 2;
            if(mid < arr.length - 1) {
                if(arr[mid] > arr[mid + 1] ) {
                    end = mid;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return start;
         */
    }
}
