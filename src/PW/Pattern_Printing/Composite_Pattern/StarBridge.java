package PW.Pattern_Printing.Composite_Pattern;

import java.util.Scanner;

public class StarBridge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nsp=1;

        for(int i=1;i<=2*n-1;i++) {
            System.out.print("* ");
        }

        System.out.println();

        for(int i=1;i<=n;i++) {
            //left side
            for(int j=n-i;j>=1;j--) {
                System.out.print("* ");
            }

            //spaces
            for(int k=nsp;k<=2*i-1;k++) {
                System.out.print("  ");
            }


            //right side
//            for(int l=i;l<=n-1;l++) {
//                System.out.print("*");
//            }
//
//            both method are same
            for(int j=n-i;j>=1;j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
