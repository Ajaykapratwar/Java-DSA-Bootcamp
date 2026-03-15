package PW.Pattern_Printing.Squares;

import java.util.Scanner;

public class Alphasquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
    }
}
