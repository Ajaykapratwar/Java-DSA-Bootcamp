package PW.Basic_Sorting;

public class insertion {
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
        int[] arr={47,12,98,67,23,11,2};
        int n=arr.length;
        print(arr);

        for(int i=1;i<n;i++) {
            for(int j=i;j>=1;j--) {
                int first=arr[j];
                if(first<arr[j-1]) {
                    swap(arr,j,j-1);
                } else{
                    break;
                }
            }
        }
        print(arr);
    }
}
