package DSA.SlidingWindow;

//424. Longest Repeating Character Replacement
//
//You are given a string s and an integer k. You can choose any character of the string and
//change it to any other uppercase English character. You can perform this operation at most k times.
//Return the length of the longest substring containing the same letter you can get after performing
//the above operations.


import java.util.HashMap;

public class LongestRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(characterReplacement("AAABBCCD", 2));
    }

    public static int characterReplacement(String s, int k) {
        int left = 0, right = 0, n = s.length(), maxLen = 0, maxFreq = 0, len = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while(right < n) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);
//            maxFreq;
            len++;
            if(len - maxFreq <= k) {
//                maxLen = Math.max(maxLen, )
            }
        }
        return maxLen;
    }
}
