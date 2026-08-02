package DSA.Recursion.Lec_28_arrays;

public class Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,9,12};
        System.out.println(sorted(arr,0));
    }

    public static boolean sorted(int[] arr,int i) {
        if(i == arr.length - 1) {
            return true;
        }
        if(arr[i] <= arr[i+1]) {
            return sorted(arr,i+1);
        } else {
            return false;
        }
    }
}
