package Zandi07;

public class Zandi0714 {

    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int b = 0, cont = 1, k = 1;

        for(int a = 0; a < 5; a++) {
            while (b <= 4 && b >= 0) {
                arr[a][b] = k++;
                b += cont;
            }
            cont *= -1;
            b += cont;
        }

        for(int a = 0; a < 5; a++){
            for(int i = 0; i < 5; i++){
                System.out.printf("%3d", arr[a][i]);
            }
                System.out.println();
        }
    }
}
