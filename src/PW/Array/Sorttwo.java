package PW.Array;

import java.util.Arrays;

public class Sorttwo {

    /**
     * Merge two sorted arrays in O(m+n) time.
     */
    public static int[] mergeSorted(int[] a, int[] b) {
        int m = a.length, n = b.length;
        int[] c = new int[m + n];

        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (a[i] <= b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while (i < m) c[k++] = a[i++];
        while (j < n) c[k++] = b[j++];
        return c;
    }

    public static void main(String[] args) {
        int[] a = {11, 33, 54, 78};
        int[] b = {24, 56, 61, 82};

        int[] c = mergeSorted(a, b);
        System.out.println(Arrays.toString(c));
    }
}
