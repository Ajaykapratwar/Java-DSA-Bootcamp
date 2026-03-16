package PW.String_Builder;

public class CharWithMostOccurence {
    public static void main(String[] args) {
        String s = "wallahaaaaa";

        int[] arr = new int[26];
        //char[] ch = s.toCharArray();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = (int)ch - 97;
            arr[idx]++;
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
