package Problems;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        char[] ch=str.toCharArray();
        for(int i= ch.length-1;i>=0;i--) {
            System.out.print(ch[i]);
        }
    }
}
