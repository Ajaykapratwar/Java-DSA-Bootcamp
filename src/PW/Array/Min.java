package PW.Array;

public class Min {
    public static void main(String[] args) {
        int[]arr = {45,34,78,23,97,65};
        int min=arr[0];
        int n = arr.length;

        for(int i=0;i<n;i++) {
            if(min>arr[i]) {
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
