package DSA.bit_manipulation;

public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 75;

        StringBuilder sb = new StringBuilder();

        while(num != 1) {
            int rem = num % 2;
            num /= 2;
            sb.append(rem);
        }
        sb.append(num);
        System.out.println(sb.reverse().toString());
    }
}
