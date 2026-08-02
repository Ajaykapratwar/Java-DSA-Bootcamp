package DSA.SlidingWindow;

//longest substring with at most k distinct characters
//like for exampple
//s = aaabbccd and k is 2
//then the we want a substring that contain only contain the k distinct characters.
//output for this is aaabb

import java.util.HashMap;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(longestSubstring("aaabbccd", 2));
    }

//    2nd approach using sliding window method
    public static int longestSubstring(String s, int k) {
        int left = 0, right = 0, n = s.length(), maxLen = 0;
        int len = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while(right < n) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);

            while(map.size() > k) {
                int freq = map.get(s.charAt(left));

                if(freq == 1) map.remove(s.charAt(left));
                else map.replace(s.charAt(left), freq - 1);
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        map.clear();
        return maxLen;
    }


//    1st approach but time complexity is O(n^2)
//    public static int longestSubstring(String s, int k) {
//        int left = 0, right = 0, n = s.length(), maxLen = 0;
//        int len = 0;
//        HashMap<Character, Integer> map = new HashMap<>();
//        for(left = 0; left < n; left++) {
//            for (right = left; right < n; right++) {
//                if (!map.containsKey(s.charAt(right))) {
//                    map.put(s.charAt(right), 1);
//            }
//            if (map.containsKey(s.charAt(right))) {
//                    int freq = map.get(s.charAt(right));
//                    map.put(s.charAt(right), freq + 1);
//                }
//                if (map.size() <= k) {
//                    maxLen = Math.max(maxLen, right - left + 1);
//                }
//                else {
//                    break;
//                }
//            }
//            map.clear();
//        }
//        return maxLen;
//    }
}
