package DSA.Recursion.Lec_32_Subset_String;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class String_Sbuseq {
    public static void main(String[] args) {
        subseq("","abc");
    }


    public static void subseq(String p, String up) {
        if(up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
 
        char ch = up.charAt(0);
        int a = ch;

        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    public static ArrayList<String> subseqRet(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subseqRet(p + ch, up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }


    public static void subseqAscii(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseqAscii(p + ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (ch+0), up.substring(1));
    }


    public static ArrayList<String> subseqRetAscii(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subseqRetAscii(p + ch, up.substring(1));
        ArrayList<String> right = subseqRetAscii(p, up.substring(1));
        ArrayList<String> third = subseqRetAscii(p + (ch+0), up.substring(1));

        left.addAll(right);
        left.addAll(third);

        return left;
    }
}
