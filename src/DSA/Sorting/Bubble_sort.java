package DSA.Sorting;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        System.out.println(Arrays.toString(bubble_sort(arr)));
    }

    static int[] bubble_sort(int[] arr) {
        int n = arr.length;
        for(int i = 0;i < n - 1;i++) {
            boolean flag = true;
            for(int j = 0;j < n-1-i;j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if(flag == true) break;
        }
        return arr;
    }
}
