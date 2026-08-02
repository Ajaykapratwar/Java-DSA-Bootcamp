package PW.Basic_Sorting;

public class reversebubblesort {
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
        int[] arr={10,-4,1,8,20,-6};
        int n=arr.length;
        print(arr);

        // bubble sort algorithm
        for(int i=0;i<n-1;i++) {   // no. of passes
            for(int j=0;j<n-1-i;j++) {
                if(arr[j]<arr[j+1]) {
                    swap(arr,j,j+1);
                }
            }
        }
        print(arr);
    }
}
