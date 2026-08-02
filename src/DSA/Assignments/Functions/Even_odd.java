package DSA.Assignments.Functions;

public class Even_odd {
    public static void main(String[] args) {
        System.out.println(check(45));
    }

    static int check(int a) {
        if(a % 2 == 0) {
            System.out.println("It is even number...");
        }
        else {
            System.out.println("It is odd number...");
        }
        return a;
    }
}
