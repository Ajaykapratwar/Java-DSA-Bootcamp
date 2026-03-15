package PW;

import java.util.Scanner;

public class Absolute {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n < 0) System.out.println(-n);
        else System.out.println(n);
    }
}



