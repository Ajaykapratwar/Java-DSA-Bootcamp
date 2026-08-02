package PW.String_Builder;

import java.util.Arrays;

public class Sorting_String {
    public static void main(String[] args) {
        String str = "ajay";
        char[] arr = str.toCharArray();

        Arrays.sort(arr);
        for(char ele : arr) {
            System.out.print(ele);
        }

        System.out.println();

        StringBuilder sb = new StringBuilder("kapratwar");

        char[] arr2 = sb.toString().toCharArray();
        Arrays.sort(arr2);
        for(char ele : arr2) {
            System.out.print(ele);
        }
    }
}
