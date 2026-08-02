package DSA.HashMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMapFinal<String, String> map = new HashMapFinal<>();

        map.put("Mango", "King of fruits");
        map.put("Apple", "A sweet red fruit");
        map.put("Litchi", "Kunal's fav fruit");
        map.put("Banana", "Yellow fruit");
        map.put("Guava", "Vitamin C rich fruit");

        System.out.println(map);

        map.remove("Apple");
        System.out.println("After removing Apple: " + map);

        System.out.println("Contains Mango? " + map.containsKey("Mango"));
        System.out.println("Value for Litchi: " + map.get("Litchi"));
    }
}
