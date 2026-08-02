package PW.Advance_Sorting;

public class Merge_Sort {
    public static void print(int arr[]){
        for(int ele:arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void merge(int[] a,int[] b,int[] c) {
        int i=0,j=0,k=0;
        int m=a.length,n=b.length;
        while(i<m && j<n) {
            if(a[i]<=b[j]) {
                c[k]=a[i];
                i++;
            }
            else{
                c[k]=b[j];
                j++;
            }
            k++;
        }
        while(i<m){
            c[k]=a[i];
            i++;
            k++;
        }
        while(j<n) {
            c[k]=b[j];
            j++;
            k++;
        }
    }
    public static void mergesort(int[] arr) {
        int n=arr.length;
        if(n==1) return;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];

        for(int i=0;i<n/2;i++) a[i]=arr[i];
        for(int j=0;j<n-n/2;j++) b[j]=arr[n/2+j];
        //magic
        mergesort(a);
        mergesort(b);
    
        merge(a,b,arr);
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1}; // Reverse sorted array
        print(arr);
        mergesort(arr);
        print(arr);
    }
}
