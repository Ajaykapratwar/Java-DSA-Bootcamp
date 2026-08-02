package Leetcode;

// https://leetcode.com/problems/missing-number/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Missing_number {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        //System.out.println(missingNumber(arr));
        System.out.println(Arrays.toString(new List[]{findDisappearedNumbers(arr)}));
    }
    public static int missingNumber(int[] arr) {
        int n = arr.length;
        int i = 0;

        while (i < n) {
            if (arr[i] < n && i != arr[i]) {
                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return n;
    }


    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int n = arr.length;
        int i = 0;
        ArrayList<Integer> ans = new ArrayList();

        while (i < n) {
            if (arr[i] < n && i != arr[i]) {
                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;
            } else {
                i++;
            }
        }
        for(int k = 0;k < n;k++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] != j) {
                    ans.add(k+1);
                }
            }
        }
        return ans;
    }

}
