package DSA.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
//        arr[0]=1;
//        arr[1]=5;
//        arr[2]=8;
//        arr[3]=2;
//        arr[4]=9;

        // using for loop
//        for(int i=0;i<arr.length;i++) {
//            System.out.println(arr[i]);
//        }

        // using for each loop
//        for(int i : arr) {
//            System.out.println(i);
//        }

//        System.out.println(Arrays.toString(arr));

        String[] str = new String[3];
//        System.out.println(str[1]);

        // input
        for(int i=0;i<arr.length;i++) {
            arr[i] = in.nextInt();
        }

        // output
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
