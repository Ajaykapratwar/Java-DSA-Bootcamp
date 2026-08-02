package PW.Pattern_Printing.Special_Pattern;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
//        int n = in.nextInt();

        for(int i=1;i<=m;i++) {
            for(int k=m-i;k>0;k--){
                System.out.print("  ");
            }
            for(int j=1;j<=m;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
