package DSA.HashMap;

import java.util.Hashtable;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        int[] arr1 = {1, 10, 100};
        int[] arr2 = {1000};
        System.out.println(longestCommonPrefix(arr1, arr2));
    }

    public static int longestCommonPrefix(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int maxLength = 0;
        Hashtable<Integer, Integer> table = new Hashtable<>();

        for(int i = 0; i < n; i++) {
            table.put(arr1[i], 1);
        }

        for (int num : arr2) {

            String s = String.valueOf(num);

            for (int i = 1; i <= s.length(); i++) {

                String part = s.substring(0, i);
                int temp = Integer.parseInt(part);
                if(table.containsKey(temp)) {
                    maxLength = Math.max(maxLength, i);
                }
            }
        }
        return maxLength;
    }
}
