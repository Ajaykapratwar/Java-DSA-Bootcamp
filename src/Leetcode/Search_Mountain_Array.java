package Leetcode;

// https://leetcode.com/problems/find-in-mountain-array/description/

public class Search_Mountain_Array {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,2,1};
        int target = 3;

        int ans = search(arr,target);
        System.out.println(ans);
    }
    public static int search(int[] arr,int target) {
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
        return binary(arr,target);
    }
    public static int binary(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while(start <=end) {
            int mid = (start + end) / 2;
            if(target == arr[mid]) {
                return mid;
            }
            else if(target < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
