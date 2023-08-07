package Zandi_08;

import java.util.Scanner;

public class Zandi0807 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int num = s.nextInt();

        if (num % 2 == 0) {
            System.out.println("홀수를 입력해야 합니다.");
        } else {
            for (int i = 0; i < num / 2 + 1; i++) {
                for (int y = 0; y < num; y++) {
                    if (y >= num / 2 - i && y <= num / 2 + i) {
                        System.out.print("o");
                    } else {
                        System.out.print("x");
                    }
                }
                System.out.println();
            }
            for (int i = num / 2; i > 0; i--) {
                for (int y = 0; y < num; y++) {
                    if (y >= num / 2 - i + 1 && y <= num / 2 + i - 1) {
                        System.out.print("o");
                    } else {
                        System.out.print("x");
                    }
                }
                System.out.println();
            }
        }
    }
}
