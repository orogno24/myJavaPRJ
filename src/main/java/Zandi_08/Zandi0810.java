package Zandi_08;

import java.util.Scanner;

public class Zandi0810 {

    public static void V_II(int num) {
        for (int x = 0; x < num; x++) {
            if (x > 5 && x == num / 2 + 3) break;

            for (int y = 0; y < num + 2; y++) {
                if (x >= y + 1 || y >= num + 2 - x) {
                    System.out.print("x");
                } else System.out.print("o");
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
                V_II(num);
                break;
            }
        }
    }
}