package DSA.HashMap;

import java.util.*;

public class IterateHashMap {
    public static void main(String[] args) {
//        HashSet<Integer> set = new HashSet<>();
//        set.add(20);
//        set.add(100);
//        set.add(76);
//        set.add(21);
//
//        for(int ele : set) {
//            System.out.println(ele);
//        }

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ajay", 20);
        map.put("Pranav", 21);
        map.put("Naksh", 12);
        map.put("Pratik", 26);

        for(String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
