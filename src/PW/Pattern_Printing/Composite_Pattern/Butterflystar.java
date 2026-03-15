package PW.Pattern_Printing.Composite_Pattern;

import java.util.Scanner;

public class Butterflystar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            for(int k=1;k<=2*(n-i);k++) {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // outer loop to handle lower part
        for(int i=n;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            for(int k=1;k<=2*(n-i);k++) {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
