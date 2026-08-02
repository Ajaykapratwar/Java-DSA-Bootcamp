package PW.String_Builder;

import java.util.Scanner;

public class EvenPosTo_a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine() , str="";
        int n = s.length();

        for(int i = 0;i < n;i++) {
            if(i % 2 == 0) {
                str = str + 'a';
            } else {
                str = str + s.charAt(i);
            }
        }
        System.out.println(s);
        System.out.println(str);;
    }
}
