package Leetcode;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int target = 1;
        int[] temp = searchRange(arr,target);
        for(int ele : temp) {
            System.out.print(ele+" ");
        }
    }
    public static int[] searchRange(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int[] ans = new int[2];
        ans[0]=-1;
        ans[1]=-1;

        while(start<=end) {
            int mid = (start + end) / 2;
            if(target == arr[mid]) {
                ans[0] = mid;
                end=mid-1;
            }
            else if(target < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        start = 0;
        end = arr.length - 1;

        while(start<=end) {
            int mid = (start + end) / 2;
            if(target == arr[mid]) {
                ans[1] = mid;
                start=mid+1;
            }
            else if(target < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
