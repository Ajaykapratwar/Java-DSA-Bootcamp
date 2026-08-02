package DSA.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = in.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter the elements of the array : ");

        for(int i=0;i< arr.length;i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("The array is : "+Arrays.toString(arr));
        System.out.print("Enter the target element you want to search : ");
        int target = in.nextInt();

        int ans = linear(arr,target);
        System.out.println("The target element is at index : "+ans);
    }

    static int linear(int[] arr,int target) {
        if(arr.length == 0) {
            return -1;
        }

        for(int i=0;i<arr.length;i++) {
            if(target == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
