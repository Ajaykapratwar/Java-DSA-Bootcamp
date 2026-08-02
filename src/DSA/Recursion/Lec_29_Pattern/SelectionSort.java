package DSA.Recursion.Lec_29_Pattern;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {42, 7, 15, 3, 29, 89, 12, 76, 5, 33};
        selection(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int[] arr, int n) {
        if(n <= 1) {
            return;
        }
        int mindx = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(max < arr[i]) {
                max = arr[i];
                mindx = i;
            }
        }


        int j = n - 1;
        int temp = arr[mindx];
        arr[mindx] = arr[j];
        arr[j] = temp;
        selection(arr, n - 1);

    }
}
