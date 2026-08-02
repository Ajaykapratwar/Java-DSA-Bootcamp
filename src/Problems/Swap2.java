package Problems;

import java.util.Scanner;

public class Swap2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("The old value of a & b is : "+num1+" "+num2);

        swap(num1,num2);
    }

    static void swap(int a,int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("The new value of a & b is : "+a+" "+b);
    }
}
