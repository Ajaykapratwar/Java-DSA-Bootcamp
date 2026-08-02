package PW.Pattern_Printing.Composite_Pattern;

import java.util.Scanner;

public class NumberBridge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // First row
        for(int i=1; i<=2*n-1; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        // Remaining rows
        for(int i=1; i<=n-1; i++) {

            // Left side
            for(int j=1; j<=n-i; j++) {
                System.out.print(j+" ");
            }

            // Spaces
            for(int k=1; k<=2*i-1; k++) {
                System.out.print("  ");
            }

            // Right side
            for(int j=n+i; j<=2*n-1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
