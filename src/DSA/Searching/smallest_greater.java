package DSA.Searching;

// find the smallest greater letter than the target

public class smallest_greater {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'c';
        char a =nextGreatestLetter(arr,target);
        System.out.println(a);
    }

    public static char nextGreatestLetter(char[] arr, char target) {
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start <= end) {
            if(target >= arr[n-1]) {
                return arr[0];
            }
            int mid = (start + end) / 2;
            if((int)target < (int)arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}









/*
class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start <= end) {
            if(target >= arr[n-1]) {
                return arr[0];
            }
            int mid = (start + end) / 2;
            if((int)target < (int)arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}

*/
