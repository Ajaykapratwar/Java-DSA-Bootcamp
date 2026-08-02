package PW.Array;

public class Product {
    public static void main(String[] args) {
        int[] arr = {5,9,3,4};
        int n = arr.length;
        int pro = 1;

        for(int i=0;i<n;i++) {
            pro = pro*arr[i];
        }
        System.out.println(pro);
    }
}
