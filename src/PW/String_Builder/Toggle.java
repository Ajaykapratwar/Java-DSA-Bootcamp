package PW.String_Builder;

// input a string builder and change lower to upper and vice a versa

import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder s = new StringBuilder(in.nextLine());
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 65 && ascii <= 90) {   //small
                ascii += 32;
                ch = (char) ascii;
                s.setCharAt(i, ch);
            } else if (ascii >= 97 && ascii <= 122) {
                ascii -= 32;
                ch = (char) ascii;
                s.setCharAt(i, ch);
            }
        }
        System.out.println(s.toString());
    }
}
