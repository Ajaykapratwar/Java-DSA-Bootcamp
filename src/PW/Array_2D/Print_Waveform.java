package PW.Array_2D;

public class Print_Waveform {
    public static void print(int[][] arr) {
        for (int[] ints : arr) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5,98,34},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20,40},
                {21, 22, 23, 24, 25}
        };
        int n = arr.length;

        waveform(arr,n);
    }

    public static void waveform(int[][] arr,int n) {
        for(int i=0;i<n;i++) {
            if(i%2==0) {
                for(int j=0;j<arr[i].length;j++) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j= arr[i].length-1;j>=0;j--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
