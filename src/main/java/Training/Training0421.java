package Training;

import java.util.Scanner;

public class Training0421 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        for (int a = 1; a <= x; a++) {
            for (int b = x; a < b; b--) {
                System.out.print(" ");
            }
            for (int c = 1; c <= 2 * a - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int a = x - 1; a > 0; a--) {
            for (int b = 0; b < x-a; b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= 2 * a - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
