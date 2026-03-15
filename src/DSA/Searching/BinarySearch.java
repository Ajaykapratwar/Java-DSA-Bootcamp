package DSA.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6};
        int target = 6;
        int ans = binary(arr,target);
        if(ans == -1) {
            System.out.println("Array index out of bound..");
        } else {
            System.out.println("Index is : "+ans);
        }
    }

    static int binary(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

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
        return -1;
    }
}
