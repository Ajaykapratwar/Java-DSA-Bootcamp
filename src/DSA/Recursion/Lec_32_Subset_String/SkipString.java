package DSA.Recursion.Lec_32_Subset_String;

public class SkipString {
    public static void main(String[] args) {
        String ans = "";
        ans = skipAppNotApple("bacappnlecdah");
        System.out.println(ans);
    }

    public static String skip(String s) {
        if(s.isEmpty()) {
            return "";
        }
        if(s.startsWith("apple")) {
            return skip(s.substring(6));
        } else {
            return s.charAt(0) + skip(s.substring(1));
        }
    }


    // if there is not an apple then only skip app.
    public static String skipAppNotApple(String s) {
        if(s.isEmpty()) {
            return "";
        }
        if(s.startsWith("app") && !s.startsWith("apple")) {
            return skip(s.substring(3));
        } else {
            return s.charAt(0) + skipAppNotApple(s.substring(1));
        }
    }
}
