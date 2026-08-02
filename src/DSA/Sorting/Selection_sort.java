package DSA.Sorting;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        System.out.println(Arrays.toString(selection_sort(arr)));
    }

    static int[] selection_sort(int[] arr) {
        int n = arr.length;
        for(int i = 0;i < n - 1;i++) {
            int mindx = i;
            for(int j = i + 1;j < n;j++) {
                if(arr[j] < arr[mindx]) {
                    mindx = j;
                }
            }
            int temp = arr[mindx];
            arr[mindx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
