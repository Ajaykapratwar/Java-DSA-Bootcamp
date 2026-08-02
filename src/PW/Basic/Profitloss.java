package PW;

import java.util.Scanner;

public class Profitloss {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cost = in.nextInt();
        int sell = in.nextInt();

        if(sell > cost) System.out.println("Profit : "+(sell-cost));
        else if(sell == cost) System.out.println("No profit nor loss.");
        else System.out.println("Loss : "+(cost-sell));
    }
}
