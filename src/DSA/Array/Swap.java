package DSA.Array;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {41,78,34,92,62};
        System.out.println("The original array is : "+Arrays.toString(arr) +" ");
        swap(arr,0,3);
        System.out.println("The array after swapping : "+Arrays.toString(arr) +" ");
    }
    static void swap(int[] arr,int index1,int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
