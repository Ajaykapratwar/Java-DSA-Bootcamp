package DSA.Searching;

// ceiling of a number = smallest element in
// array greater than or equal to target.


public class Ceiling_number {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;

        int ans = ceiling(arr,target);
        System.out.println(arr[ans]);
    }

    public static int ceiling(int[] arr,int target) {
        int n = arr.length;

        if(target > arr[n-1]) {
            return -1;
        }

        int start = 0;
        int end = n-1;

        while(start <= end) {
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
        return start;
    }
}
