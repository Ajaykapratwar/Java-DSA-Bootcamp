package PW.Array;

import java.util.Arrays;

public class Sortzero_one {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,0,0,1};
        int n = arr.length;
        int nOofzeros=0;

//        for(int i=0;i<n;i++) {
//            if(arr[i]==0) nOofzeros++;
//        }
//        for(int i=0;i<nOofzeros;i++) {
//            arr[i]=0;
//        }
//        for(int i=nOofzeros;i<n;i++) {
//            arr[i]=1;
//        }


        int i=0,j=n-1;

        while(i<j) {
            if (arr[i] == 0) i++;
            if (arr[j] == 1) j--;
            if(i<j && arr[i]==1 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
