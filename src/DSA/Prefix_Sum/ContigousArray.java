package DSA.Prefix_Sum;

import java.util.HashMap;
import java.util.Map;

public class ContigousArray {
    public static void main(String[] args) {
        System.out.println(findMaxLength(new int[]{0,1,1,1,1,1,0,0,0}));
    }

    public static int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int maxLength = 0, sum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += (nums[i] == 1) ? 1 : -1;
            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }
            else {
                int curr = i - map.get(sum);
                maxLength = Math.max(maxLength, curr);
            }
        }
        return maxLength;
    }
}
