package DSA.bit_manipulation;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String s = "1101";
        int n = s.length(), p2 = 1, num = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = n-1; i>=0; i--) {
            if(s.charAt(i) == '1') {
                num += p2;
            }
            p2 *= 2;
        }
        System.out.println(num);
    }
}
