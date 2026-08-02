package PW.Basic_Sorting;

public class selectionSort {
    public static void print(int arr[]){
        for(int ele:arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr,int a,int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void main(String[] args) {
        int[] arr={10,-4,20,1,8,-6};
        int n=arr.length;
        print(arr);

        for(int i=0;i<n-1;i++) {
            //int min=Integer.MAX_VALUE;
            int mindx=i;
            for(int j=i+1;j<n;j++) {
                if(arr[j]<arr[mindx]) {
                    mindx=j;
                }
            }
            swap(arr,i,mindx);
        }

        print(arr);
    }
}
