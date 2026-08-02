package PW.Array;

import java.util.Arrays;

public class Sort_0_1_2 {
    public static void swap(int[] arr,int a,int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,1,2,0,0};
        int n=arr.length;
        int mid = 0;
        int lo = 0;
        int hi = n-1;

        while(mid<=hi) {
            if(arr[mid] == 0) {
                swap(arr,lo,mid);
                mid++;
                lo++;
            }
            else if(arr[mid] == 1) {
                mid++;
            }
            else {
                swap(arr,mid,hi);
                hi--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
