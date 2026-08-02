package PW.Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {4,7,2,9,3,1,5,6};
        int n = arr.length;

        // to print array
        for(int ele : arr) {
            System.out.print(ele+" ");
        }

        System.out.println();

        //to reverse the array
//        for(int i=0;i<(n+1)/2;i++) {
//            int j = n-1-i;
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }

        int i=0,j=n-1;
        while(i<=j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(int ele : arr) {
            System.out.print(ele+" ");
        }
    }
}
