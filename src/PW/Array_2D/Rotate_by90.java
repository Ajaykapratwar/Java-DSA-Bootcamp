package PW.Array_2D;

public class Rotate_by90 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        int n= arr.length;
        for (int[] ints : arr) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=0;i<n;i++) {
            for(int j=0;j<=i;j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
            //System.out.println();
        }

        for (int[] ints : arr) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < n; i++) {
            // Swap the first column with the last column
            if(i<=2) {
                int temp = arr[i][0];
                arr[i][0] = arr[i][n - 1];
                arr[i][n - 1] = temp;
            }


            // Swap the second column with the second to last column
            if (n > 2) { // Only if there are at least 3 columns
                int j=1;
                int temp = arr[i][j];
                arr[i][j] = arr[i][n - 2];
                arr[i][n - 2] = temp;
                j=j+1;
            }
        }

        for (int[] ints : arr) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
