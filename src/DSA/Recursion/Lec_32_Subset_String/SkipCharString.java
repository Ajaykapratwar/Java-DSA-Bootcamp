package DSA.Recursion.Lec_32_Subset_String;

public class SkipCharString {
    public static void main(String[] args) {
        String ans = "";
        skip("baccad",ans,0);
        System.out.println(ans);
    }

    public static void skip(String s, String ans, int a) {
        if(a >= s.length()) {
            System.out.println(ans);
            return;
        }
        if(s.charAt(a) != 'a') {
            ans += s.charAt(a);
        }
        skip(s,ans,a + 1);
    }
}
