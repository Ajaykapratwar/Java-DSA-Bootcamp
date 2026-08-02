package DSA.Recursion;

public class MazePath {
    public static void main(String[] args) {
        System.out.println(countPath(7,7, 3));
    }


    static int countPath(int r, int c, int block) {
        if(r == block && c == block) {
            return 0;
        }
        if(r == 1 || c == 1) {
            return 1;
        }

        int left = countPath(r - 1, c, block);
        int right = countPath(r, c - 1, block);
        //int a = countPath(r - 1, c - 1);

        return left + right;
    }


    static void printPath(String p, int r, int c) {
        if(r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            printPath(p + 'd', r - 1, c); // Move down
        }
        if (c > 1) {
            printPath(p + 'r', r, c - 1); // Move right
        }
        printPath(p,r - 1, c - 1);
    }
}
