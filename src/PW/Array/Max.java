package PW.Array;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = in.nextInt();
        int[] arr = new int[n];

        int max=arr[0];

        // taking array from the user
        for(int i=0;i<n;i++) {
            arr[i]= in.nextInt();
        }

        for(int i=0;i<n;i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
