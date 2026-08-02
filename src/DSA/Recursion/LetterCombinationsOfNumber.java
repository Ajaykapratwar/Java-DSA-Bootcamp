package DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfNumber {
    public static void main(String[] args) {
        System.out.println(letterCombinationsRet("","23"));
    }

    static void letterCombinations(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        for(int i = (digit - 2) * 3; i < (3*digit) - 3; i++) {
            char ch = (char)(97 + i);

            letterCombinations(p + ch, up.substring(1));
        }

    }

    public static List<String> letterCombinationsRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';

        List<String> list = new ArrayList<>();

        for (int i = (digit - 2) * 3; i < (3 * digit) - 3; i++) {
            char ch = (char) (97 + i);

            list.addAll(letterCombinationsRet(p + ch, up.substring(1)));
        }
        return list;
    }
}
