package DSA.Searching;

public class Floor_number {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;

        int ans = floor(arr,target);
        System.out.println(ans);
    }

    public static int floor(int[] arr,int target) {
        int n = arr.length;
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
        return end;
    }
}
