package Leetcode;

// https://leetcode.com/problems/find-the-duplicate-number/

public class Duplicate_Number {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] arr) {
        while(true) {
            if(arr[arr[0]] == arr[0]) {
                return arr[0];
            }
            int temp = arr[0];
            arr[0] = arr[temp];
            arr[temp] = temp;
        }
    }
}
