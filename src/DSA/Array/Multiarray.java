package DSA.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Multiarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        //print it
//        for(int row=0;row <arr.length;row++) {
//            for(int col=0;col<arr[row].length;col++) {
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }

        int[][] array = new int[3][3];
        //input
        for(int i=0;i< array.length;i++) {
            for(int j=0;j<array[i].length;j++) {
                array[i][j] = in.nextInt();
            }
        }
        //output
//        for(int i = 0; i <array.length; i++) {
//            for(int j = 0; j <array[i].length; j++) {
//                System.out.print(array[i][j]+" ");
//            }
//            System.out.println();
//        }

        //output
        for(int row=0;row<array.length;row++) {
            System.out.println(Arrays.toString(array[row]));
        }
    }
}



//// Define the array with specific sizes for each inner array
//int[][] array = new int[3][];
//
//// Initialize each inner array with a specific size
//array[0] = new int[2]; // Inner array 1 with 2 elements
//array[1] = new int[3]; // Inner array 2 with 3 elements
//array[2] = new int[4]; // Inner array 3 with 4 elements
