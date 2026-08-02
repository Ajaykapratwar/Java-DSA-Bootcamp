package PW.Array;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,5,7,3,9};
        int x = 10;

        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(x==arr[i]+arr[j]) {
                    System.out.println(arr[i]+"  "+arr[j]);
                }
            }
        }
    }
}
