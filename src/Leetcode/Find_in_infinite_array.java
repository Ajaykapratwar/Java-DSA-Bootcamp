package Leetcode;

public class Find_in_infinite_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50};

        int target = 49;
        int index = find(arr,target);
        System.out.println(index);
    }

    public static int find(int[] arr,int target) {
        int start = 0;
        int end = 1;
        while(target > arr[end]) {
            start=end+1;
            end=end*2;

            if(end>=arr.length) {
                end=arr.length-1;
                break;
            }
        }
        return binary(arr,target,start,end);
    }

    public static int binary(int[] arr, int target,int start,int end) {
        int n = arr.length;
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
