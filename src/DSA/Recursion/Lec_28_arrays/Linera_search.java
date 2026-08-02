package DSA.Recursion.Lec_28_arrays;

import java.util.ArrayList;

public class Linera_search {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,8};

        ArrayList<Integer> list = new ArrayList<>();

//        System.out.println(find(arr,0,4));
//        System.out.println(findIndex(arr,0,4));
//        System.out.println(findIndexLast(arr,arr.length - 1,4));
//
//        findallIndex(arr,0,4,list);
//        System.out.println(list);

        System.out.println(findallIndex2(arr,0,4));
    }

    public static boolean find(int[] arr, int i, int target) {
        if(i == arr.length) {
            return false;
        }
        if(arr[i] == target) {
            return true;
        }
        return find(arr,i+1,target);
    }

    public static int findIndex(int[] arr,int i,int target) {
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == target) {
            return i;
        }
        return findIndex(arr,i+1,target);
    }

    public static int findIndexLast(int[] arr,int i,int target) {
        if(i == -1) {
            return -1;
        }
        if(arr[i] == target) {
            return i;
        }
        return findIndex(arr,i - 1,target);
    }

    static ArrayList<Integer> findallIndex(int[] arr, int i, int target, ArrayList<Integer> list) {
        if(i == arr.length) {
            return list;
        }
        if(arr[i] == target) {
            list.add(i);
        }
        return findallIndex(arr,i+1,target,list);
    }

    static ArrayList<Integer> findallIndex2(int[] arr, int i, int target) {

        ArrayList<Integer> list = new ArrayList<>();

        if(i == arr.length) {
            return list;
        }

        if(arr[i] == target) {
            list.add(i);
        }

        ArrayList<Integer> ansFromBelowCalls = findallIndex2(arr,i+1,target);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}
