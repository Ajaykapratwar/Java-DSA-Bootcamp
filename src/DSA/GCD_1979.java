package DSA;

// https://leetcode.com/problems/find-greatest-common-divisor-of-array/description/

public class GCD_1979 {
    public static void main(String[] args) {
        int[] arr = {3,3};
        System.out.println(findGCD(arr));
    }

    public static int max(int[] arr) {
        int temp = arr[0];
        for(int i = 1;i < arr.length;i++) {
            if(arr[i] > temp) {
                temp = arr[i];
            }
        }
        return temp;
    }

    public static int min(int[] arr) {
        int temp = arr[0];
        for(int i = 1;i < arr.length;i++) {
            if(arr[i] < temp) {
                temp = arr[i];
            }
        }
        return temp;
    }

    public static int findGCD(int[] arr) {
        int num1 = max(arr) , num2 = min(arr);

        for(int i = Math.min(num1,num2);i >= 1;i--) {
            if(num1 % i == 0 && num2 % i == 0) {
                return i;
            }
        }
        return -1;
    }
}
