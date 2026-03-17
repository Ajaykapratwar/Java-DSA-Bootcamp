package HackWithInfy;

import java.util.Scanner;

public class FoodStamp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int[] v = new int[n];
        int[] d = new int[n];

        for(int i = 0; i < n; i++) {
            v[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++) {
            d[i] = in.nextInt();
        }
    }
}
