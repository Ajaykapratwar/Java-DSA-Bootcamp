package PW;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x=0;

        for(int i=2;i<n;i++) {
            if(n % i == 0) {
                System.out.println("Composite number");
                x=1;
                break;
            }
        }
        if(x==0) System.out.println("Prime number");
    }
}
