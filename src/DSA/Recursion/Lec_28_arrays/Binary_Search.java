package DSA.Recursion.Lec_28_arrays;

// this is a binary search algorithm with using recursion.

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {45,67,75,79,83,87,95};
        int target = 83;
        int ans = search(arr,target,0,arr.length-1);
        System.out.println(ans);
    }

    static int search(int[] arr,int target,int start,int end) {
        if(start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(target == arr[mid]) {
            return mid;
        }
        if(target < arr[mid]) {
            return search(arr,target,start,mid-1);
        } else{
            return search(arr,target,mid+1,end);
        }
    }
}
