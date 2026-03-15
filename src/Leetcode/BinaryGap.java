package Leetcode;

public class BinaryGap {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(binaryGap(n));
    }

//    public static int binaryGap(int n) {
//        String binary = Integer.toBinaryString(n);
//        int[] arr = binary.chars().map(c -> c - '0').toArray();
//
//        int maxGap = 0;
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = i + 1; j < arr.length; j++) {
//                if(arr[j]==1) {
//                    if(arr[i] == 1) maxGap = Math.max(j - i, maxGap);
//                    break;
//                }
//            }
//        }
//        return maxGap;
//    }

//  optimized code
    public static int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        int[] arr = binary.chars().map(c -> c - '0').toArray();

        int lastIndex = -1;
        int maxGap = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                if(lastIndex != -1) maxGap = Math.max(maxGap, i-lastIndex);
                lastIndex = i;
            }
        }
        return maxGap;
    }
}
