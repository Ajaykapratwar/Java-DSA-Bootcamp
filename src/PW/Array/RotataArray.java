package PW.Array;

import java.util.Arrays;

public class RotataArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int n = arr.length;
        int k = 11;
        k = k % n;

        //int[] result = new int[n];

        /*
 Method - 1
        for(int i=0;i<k;i++) {
            result[k-1-i] = arr[n-1-i];
        }

        for(int i=k;i<n;i++) {
            result[i] = arr[i-k];
        }
        System.out.println(Arrays.toString(result));
*/


        /*
 Method - 2
         */
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);

        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr,int i,int j) {
        while(i<=j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}


