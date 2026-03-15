package PW.Pattern_Printing.Special_Pattern;

import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a=0;
        int b=1;

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                if(i%2!=0) {
                    if(j%2!=0){
                        System.out.print(b+" ");
                    } else {
                        System.out.print(a+" ");
                    }
                } else {
                    if(j%2!=0){
                        System.out.print(a+" ");
                    } else {
                        System.out.print(b+" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
