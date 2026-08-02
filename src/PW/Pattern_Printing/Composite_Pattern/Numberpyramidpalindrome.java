package PW.Pattern_Printing.Composite_Pattern;

import java.util.Scanner;

public class Numberpyramidpalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=1;i<=n;i++) {
            for(int k=n-i;k>0;k--){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            for(int j=i-1;j>=1;j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
