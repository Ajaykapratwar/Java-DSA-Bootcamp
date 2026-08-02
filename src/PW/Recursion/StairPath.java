package PW.Recursion;

public class StairPath {
    public static void main(String[] args) {
        System.out.println(stair(3));
    }

    static int stair(int n) {
        if(n == 3) return 3;
        if(n <= 1) return n;
        return stair(n - 1) + stair(n - 3);
    }
}
