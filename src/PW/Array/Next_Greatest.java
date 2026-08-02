package PW.Array;

import java.util.Arrays;

public class Next_Greatest {
    public static void swap(int[] arr,int a,int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {12,8,41,37,2,49,16,28,21};
        int n = arr.length;

        great(arr,n);
    }
    public static void great(int[] arr,int n) {
        for(int i=0;i<n-1;i++) {
            int max=0;
            for(int j=i+1;j<n;j++) {
                if(arr[j] >= arr[i]) {
                    max = arr[j];
                    arr[i] = max;
                }

            }
            arr[i] = max;
        }
        System.out.println(Arrays.toString(arr));
    }
}
