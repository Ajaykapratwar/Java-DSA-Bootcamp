package PW.Pattern_Printing.Squares;

import java.util.Scanner;

public class NumSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
