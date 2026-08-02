package PW.Array;

public class NextGreatest {
    public static void main(String[] args) {
        int[] arr = {12,8,41,37,2,49,16,28,21};
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1]=-1;
        int nge=arr[n-1];

        // 1st method
//        for(int i=0;i<n;i++) {
//            int max=0;
//            for(int j=i+1;j<n;j++) {
//                if(max<arr[j]) {
//                    max=arr[j];
//                }
//            }
//            ans[i]=max;
//            if(i==n-1) {
//                ans[i]=-1;
//            }
//        }

        // 2nd method
//        for(int i=0;i<n-1;i++) {
//            int mx=Integer.MIN_VALUE;
//            for(int j=i+1;j<n;j++) {
//                mx=Math.max(mx,arr[j]);
//            }
//            ans[i]=mx;
//        }

        // 3rd method optimise
        for(int i=n-2;i>=0;i--) {
            ans[i]=nge;
            nge=Math.max(nge,arr[i]);
        }
        for(int ele:ans) {
            System.out.print(ele+" ");
        }
    }
}
