package DSA.Searching;

public class SearchInString {
    public static void main(String[] args) {
        String str = "Ajay";
        char ch = 'j';
        boolean ans = search(str,ch);
        System.out.println(ans);
    }

    static boolean search(String str,char target) {
        if(str.length()==0) {
            return false;
        }

        for(int i=0;i<str.length();i++) {
            if(target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
