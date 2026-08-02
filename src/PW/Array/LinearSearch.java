package PW.Array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = in.nextInt();
        int[] arr = new int[n];

        // taking array from the user
        for(int i=0;i<n;i++) {
            arr[i]= in.nextInt();
        }

        System.out.print("Enter the number to search : ");
        int x = in.nextInt();

        //linear search
        for(int i=0;i<n;i++) {
            if(x==arr[i]) {
                System.out.println("The position of the "+x+" is = "+(i+1));
                break;
            }
        }
    }
}
