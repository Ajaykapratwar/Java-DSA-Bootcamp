package PW.String_Builder;

import java.util.Scanner;

public class Reverse_without_builtin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(in.nextLine());
        int n = sb.length();
        System.out.println(sb);

        for(int i = 0;i < n / 2;i++) {
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(n - i - 1));
            sb.setCharAt(n - i - 1,temp);
        }
        System.out.println(sb);
    }
}
