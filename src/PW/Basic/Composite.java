package PW;

import java.util.Scanner;

public class Composite {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=2;i<n;i++) {
            if(n % i == 0) {
                System.out.println("Composite number");
                break;
            }
            else {
                System.out.println("Not a composite number");
                break;
            }
        }
    }
}
