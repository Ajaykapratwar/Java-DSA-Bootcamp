package PW.String;

import java.util.Scanner;

public class No_OfDigitsInNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        // 1st way
        String s = "" + n;
        System.out.println(s.length());

        // 2nd way
        s = Integer.toString(n);
        System.out.println(s.length());
    }
}
