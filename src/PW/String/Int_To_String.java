package PW.String;

import java.util.Scanner;

public class Int_To_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String s = n + "";
        System.out.println("Integer : "+n);
        System.out.println("String : "+s);
    }
}
