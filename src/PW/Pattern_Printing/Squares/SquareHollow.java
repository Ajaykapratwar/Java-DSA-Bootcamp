package PW.Pattern_Printing.Squares;

import java.util.Scanner;

public class SquareHollow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=1;i<=n;i++) {
            System.out.print("* ");
        }
        System.out.println();

        for(int i=1;i<=n-2;i++) {
            for(int j=1;j==1;j++) {
                System.out.print("* ");
            }
            for(int k=n-2;k>=1;k--) {
                System.out.print("  ");
            }
            for(int j=1;j==1;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++) {
            System.out.print("* ");
        }
    }
}
