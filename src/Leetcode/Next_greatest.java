package Leetcode;

import java.util.Arrays;

public class Next_greatest {
    public static void main(String[] args) {
        int[] arr1 = {2,4};
        int[] arr2 = {1,2,3,4};
        int[] n1 = new int[arr1.length];
        n1 = nextGreaterElement(arr1,arr2);
        System.out.println(Arrays.toString(n1));
    }

    public static int[] nextGreaterElement(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        for(int i = 0;i < m;i++) {
            boolean found = false;
            for(int j = 0;j < n;j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    int next = -1;
                    for (int k = j + 1; k < n; k++) {
                        if (arr1[i] < arr2[k]) {
                            next = arr2[k];
                            break;
                        }
                    }
                    arr1[i] = next;
                    break;
                }
            }
            if(!found) {
                arr1[i] = -1;
            }
        }
        return arr1;
    }
}
