package PW.Advance_Sorting;

public class shellsort {
    public static void print(int[] arr){
        for(int ele:arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void shell(int arr[],int n) {
        for(int gap=n/2;gap>=1;gap/=2) {
            for(int j=gap;j<n;j++) {
                for(int i=j-gap;i>=0;i=i-gap) {
                    if(arr[i+gap] > arr[i]) {
                        break;
                    }
                    else {
                        int temp = arr[i+gap];
                        arr[i+gap] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={77,99,22,55,66,11,44,33};
        int n= arr.length;
        print(arr);
        shell(arr,n);
        print(arr);
    }
}
