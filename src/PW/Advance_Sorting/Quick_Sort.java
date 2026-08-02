package PW.Advance_Sorting;

public class Quick_Sort {
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
    public static int partition(int[] arr,int lo,int hi) {
        int pivot=arr[lo];
        int smallercount=0;
        for(int i=lo+1;i<=hi;i++){
            if(arr[i]<=pivot) smallercount++;
        }
        int cidx=lo+smallercount;
        swap(arr,lo,cidx);

        int i=lo,j=hi;
        while(i<cidx && j>cidx) {
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<=pivot) {
                swap(arr,i,j);
            }
        }
        return cidx;
    }
    public static void quicksort(int[] arr,int lo,int hi) {
        if(lo>=hi) return;
        int idx=partition(arr,lo,hi);
        quicksort(arr,lo,idx-1);
        quicksort(arr,idx+1,hi);
    }

    public static void main(String[] args) {
        int[] arr={22,88,77,11,33,55,66,44};
        int n= arr.length;
        print(arr);
        quicksort(arr,0,n-1);
        print(arr);
    }
}
