package DSA.Recursion.Lec_29_Pattern;

public class StarPattern {
    public static void main(String[] args) {
        print(9);
    }

    public static void print(int n) {
        if(n != 0) {
            for(int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
            print(n - 1);
        }
    }
}
