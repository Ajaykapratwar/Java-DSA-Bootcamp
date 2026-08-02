package PW.Pattern_Printing.Composite_Pattern;

import java.util.Scanner;

public class StarDiamond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();

        for(int i=1;i<=n;i++) {
            for(int k=n-1;k>=1;k--) {
                System.out.print("  ");
            }
            for(int j=1;j<=2*n-1;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
