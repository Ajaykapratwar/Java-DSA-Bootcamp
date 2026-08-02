package PW.String_Builder;

import java.util.Scanner;

public class Reverse_each_word {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(in.nextLine());

        int i = 0;
        int j = 0;
        int n = sb.length();
        while( j< n) {
            if(sb.charAt(j) != ' ') j++;
            else {
                reverse(sb,i,j-1);
                i=j+1;
                j = i;
            }
        }
        reverse(sb,i,j-1);
        System.out.println(sb);
    }

    public static void reverse(StringBuilder sb,int i,int j) {
        while(i <= j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
    }
}
