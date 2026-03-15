package PW.Basic_Sorting;

public class bubblesort {
    public static void print(int arr[]){
        for(int ele:arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={7,1,9,3,-6,8};
        int n=arr.length;
        print(arr);

//        for(int x=0;x<n-1;x ++) {
//            for(int j=0;j<n-1-x;j++) {
//                if(arr[j] > arr[j+1]) {
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }

        // optimized
        for(int x=0;x<n-1;x++) {
            boolean flag=true;  // true-> sorted
            for(int j=0;j<n-1-x;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;   // false -> unsorted
                }
            }
            if(flag==true) break;
        }
        print(arr);
    }

    static void swap(int a, int b) {

    }
}
