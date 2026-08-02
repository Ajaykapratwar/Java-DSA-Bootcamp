package PW.String_Builder;

public class Maximum_Value {
    public static void main(String[] args) {
        String[] arr = {"12", "14", "56", "38", "10"};
        String maxValue = arr[0]; // Assume the first string is the maximum

        for (int i = 1; i < arr.length; i++) {
            if (isGreater(arr[i], maxValue)) {
                maxValue = arr[i];
            }
        }

        System.out.println("String with maximum value: " + maxValue);
    }

    // Helper function to compare two large numbers represented as strings
    public static boolean isGreater(String a, String b) {
        // Compare by length
        if (a.length() > b.length()) {
            return true;
        } else if (a.length() < b.length()) {
            return false;
        } else {
            // Compare lexicographically if lengths are equal
            return a.compareTo(b) > 0;
        }
    }
}
