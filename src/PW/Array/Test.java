package PW.Array;

import java.util.Arrays;

public class Test {
    public static void swap(int[] arr,int a,int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,0,0,0};
        int[] arr2={2,5,6};
        int m=3,n=3;
        int[] result = new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n) {
            if(arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
                k++;
            }
            else {
                result[k] = arr2[j];
                k++;
                j++;
            }
        }

        while(i<m) {
            result[k] = arr1[i];
            i++;
            k++;
        }
        while(j<n) {
            result[k] = arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(result));
    }
}
