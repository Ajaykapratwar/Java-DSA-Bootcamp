package DSA.DynamicProgramming;

public class ChampagneTower {
    public static void main(String[] args) {
        int poured = 100000009;
        int query_row = 33;
        int query_glass = 17;
        System.out.println(champagneTower(poured, query_row, query_glass));
    }

    public static double champagneTower(int poured, int query_row, int query_glass) {
        double[][] tower = new double[101][101];
        tower[0][0] = poured;

        for(int i = 0; i < tower.length - 1; i++) {
            for(int j = 0; j <= i; j++) {
                if(tower[i][j] > 1) {
                    double excess = (tower[i][j] - 1) / 2.0;
                    tower[i + 1][j] += excess;
                    tower[i + 1][j + 1] += excess;
                    tower[i][j] = 1;
                }
            }
        }

        return tower[query_row][query_glass];
    }
}
