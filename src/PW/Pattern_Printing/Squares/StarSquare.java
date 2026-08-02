package PW.Pattern_Printing.Squares;

import java.util.Scanner;

public class StarSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  m = in.nextInt();

        for(int i=1;i<=m;i++) {
            for(int j=1;j<=m;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
