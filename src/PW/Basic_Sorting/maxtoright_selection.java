package PW.Basic_Sorting;

public class maxtoright_selection {
    public static void print(int arr[]) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {23,56,11,89,20,5,8};
        int n = arr.length;

        print(arr);
        for(int i=n-1;i>0;i--) {
            int maxdx=0;
            for(int j=1;j<=i;j++) {
                if(arr[j]>arr[maxdx]) {
                    maxdx=j;
                }
            }
            swap(arr,i,maxdx);
        }
        print(arr);
    }
}
