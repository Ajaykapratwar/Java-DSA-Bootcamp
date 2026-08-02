package DSA.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1,4}, {8, 14}, {4, 10}};
        int[][] ans = merge(arr);
        for(int[] row : ans) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i = 1; i < intervals.length; i++) {
            int currstart = intervals[i][0];
            int currend = intervals[i][1];

            if(currstart <= end) {
                end = Math.max(end, currend);
            }
            else {
               result.add(new int[]{start, end});
               start = currstart;
               end = currend;
            }
        }

        result.add(new int[]{start, end});
        return result.toArray(new int[result.size()][]);
    }
}
