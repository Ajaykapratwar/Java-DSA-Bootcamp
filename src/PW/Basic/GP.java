package PW;

import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int a=3;

        for(int i=0;i<=n;i++) {
            System.out.println(a);
            a*=4;
        }
    }
}
