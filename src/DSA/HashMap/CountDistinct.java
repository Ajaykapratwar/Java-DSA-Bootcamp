package DSA.HashMap;

import java.util.*;

public class CountDistinct {
    public static void main(String[] args) {
        int[] arr = {1,13,24,31,46};

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
            set.add(Integer.parseInt(new StringBuilder(String.valueOf(arr[i])).reverse().toString()));

        }
        System.out.println(set.size());
    }
}
