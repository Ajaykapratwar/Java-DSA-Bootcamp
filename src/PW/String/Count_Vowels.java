package PW.String;

import java.util.Scanner;

public class Count_Vowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        int n = s.length() , count = 0;

        for(int i = 0;i < n;i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
