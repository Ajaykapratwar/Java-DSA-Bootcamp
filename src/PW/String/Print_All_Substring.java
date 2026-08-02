package PW.String;

import java.util.Scanner;

public class Print_All_Substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int n = s.length();

        for(int i = 0;i < n;i++) {
            for(int j = i + 1;j <= n;j++) {
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
