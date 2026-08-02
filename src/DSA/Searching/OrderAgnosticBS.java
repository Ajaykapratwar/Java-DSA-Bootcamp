package DSA.Searching;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {95,83,80,76,68,45,28,10,-5,-19};
        int target = -5;
        int ans = orderagnostic(arr,target);
        System.out.println(ans);
    }

    static int orderagnostic(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <=end) {
            int mid = (start + end) / 2;
            if(target == arr[mid]) {
                return mid;
            }

            if(isAsc) {
                if(target < arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if(target < arr[mid]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
