package Training;

import java.util.Scanner;

public class Training0426 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int x = s.nextInt();

        for (int a = 0; a < x; a++) {
            for (int b = x; b > a + 1; b--) {
                System.out.print("o");
            }
            for (int c = 0; c <= 2 * a + 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int a = x - 1; a > 0; a--) {
            for (int b = 0; b < x-a; b++) {
                System.out.print("o");
            }
            for (int c = 1; c <= 2 * a - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
