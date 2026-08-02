package Leetcode;

public class Search2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };

        int target = 99;
        System.out.println(search(arr,target));

    }


    static boolean search(int[][] arr,int target) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                if(target == arr[i][j])  {
                    return true;
                }
            }
        }
        return false;
    }
}
