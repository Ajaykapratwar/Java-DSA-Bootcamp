package DSA.Recursion.Lec_27;

public class N_to_1 {
    public static void main(String[] args) {
        display(5);
    }

    public static void display(int n) {
        if(n == 1) {
            System.out.println(n);
            System.out.println(n);
            return;
        }
        System.out.println(n);
        display(n - 1);
        System.out.println(n);
    }
}
