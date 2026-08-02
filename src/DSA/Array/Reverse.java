package DSA.Array;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Reverse the array in-place
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        // Print the reversed array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
