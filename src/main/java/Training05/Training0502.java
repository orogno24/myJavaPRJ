package Training05;

public class Training0502 {
    public static void main(String[] args) {


        int[][] aa = new int[9][9];
        int x, y;

        for (y = 0; y < 9; y++) {
            for (x = 0; x < 8; x++) {
                aa[x][y] = (x + 2) * (y + 1);

                System.out.printf("%dX%d=%2d  ", x + 2, y + 1, aa[x][y]);
            }
            System.out.println();
        }


    }
}
