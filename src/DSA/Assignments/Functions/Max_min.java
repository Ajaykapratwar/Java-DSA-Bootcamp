package DSA.Assignments.Functions;

public class Max_min {
    public static void main(String[] args) {
        int max = max(34,76,59);
        int min = min(98,67,19);
        System.out.println("Maximum : "+max);
        System.out.println("Minimum : "+min);
    }

    static int max(int a,int b,int c) {
        if(a > b) {
            if(a > c) {
                return a;
            }
        }
        else if(b > c) {
            return b;
        }
        else {
            return c;
        }
        return -1;
    }

    static int min(int a,int b,int c) {
        if(a < b) {
            if(a < c) {
                return a;
            }
        }
        else if(b < c) {
            return b;
        }
        else {
            return c;
        }
        return -1;
    }
}
