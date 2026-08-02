package Leetcode;

public class MaxProduct {
    public static void main(String[] args) {
        String[] words = {"abcw","baz","foo","bar","xtfn","abcdef"};
        System.out.println(maxProduct(words));
    }

    public static int maxProduct(String[] words) {
        int max = 0;
        for(int i = 0; i < words.length; i++) {
            for(int j = i + 1; j < words.length; j++) {
                if(!hasCommonChar(words[i], words[j])) {
                    max = Math.max(max, words[i].length()*words[j].length());
                }
            }
        }
        return max;
    }

    public static boolean hasCommonChar(String a, String b) {
        for (char ch : b.toCharArray()) {
            if (a.indexOf(ch) != -1) {
                return true;
            }
        }
        return false;
    }
}
