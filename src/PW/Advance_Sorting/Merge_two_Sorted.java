package PW.Advance_Sorting;

public class Merge_two_Sorted {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {10,20,30,40};
        int[] b = {21,34,55,65};
        int n=a.length,m=b.length;
        int[] c=new int[n+m];

        print(a);
        print(b);
        for(int k=0;k<c.length;k++) {
            for(int i=0;i<n;i++) {
                for(int j=0;j<m;j++) {
                    if(a[i]<=b[j]) {
                        c[k]=a[i];
                        i++;
                        k++;
                        if(i>=n) {
                            break;
                        }
                    } else{
                        c[k]=b[j];
                        j++;
                        k++;
                        if(j>=m) {
                            break;
                        }
                    }
                }
            }
        }
        print(c);
    }
}
