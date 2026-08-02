package DSA.Array;

public class Max {
    public static void main(String[] args) {
        int[] arr = {56,87,99,61,102};
        System.out.println(max(arr));
    }
    static int max(int[] arr) {
        int max=arr[0];
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
