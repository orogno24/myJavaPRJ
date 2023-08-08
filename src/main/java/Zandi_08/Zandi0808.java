package Zandi_08;

import java.util.Scanner;

public class Zandi0808 {

    public static void Xstar(int num) {

        for (int x = 0; x < num; x++) {
            for (int y = 0; y < num * 2 - 1; y++) {
                if (y == x || y == num * 2 - x - 2) {
                    System.out.print("x");
                } else System.out.print(" ");
            }
            System.out.println();
        }
        for (int x = 0; x < num - 1; x++) {
            for (int y = 0; y < num * 2 - 1; y++) {
                if (y == num - x - 2 || y == num + x) {
                    System.out.print("x");
                } else System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("숫자를 입력해주세요: ");
            int num = s.nextInt();
            if (num % 2 == 0) {
                System.out.println("홀수를 입력해야 합니다.");
            } else {
                Xstar(num);
                break;
            }
        }
    }
}
