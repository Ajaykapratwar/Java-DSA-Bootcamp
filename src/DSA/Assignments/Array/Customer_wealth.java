package DSA.Assignments.Array;

import java.util.Arrays;

public class Customer_wealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,5}};
        int maxwealth = 0;
        for(int i=0;i< accounts.length;i++) {
            int sum = 0;
            for(int j=0;j<accounts[i].length;j++) {
                sum += accounts[i][j];

                if(sum > maxwealth) {
                    maxwealth = sum;
                }
            }
        }
        System.out.println(maxwealth);
    }
}
