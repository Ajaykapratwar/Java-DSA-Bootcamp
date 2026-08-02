package PW.Pattern_Printing.Triangle;

import java.util.Scanner;

public class OddNumTri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i*2-1;j=j+2) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
