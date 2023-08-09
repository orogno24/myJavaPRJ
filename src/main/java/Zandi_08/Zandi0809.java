package Zandi_08;

import java.util.Scanner;

public class Zandi0809 {
    public static void Box_III(int num) {
        int box3 = num + 4;
        while (box3 >= num) {
            for (int x = 0; x < num; x++) {
                for (int y = 0; y < num; y++) {
                    if (x == 0 || x == num - 1 || x == num / 2 || y == num / 2 || y == 0 || y == num - 1) {
                        System.out.print("* ");
                    } else System.out.print("  ");
                }
                System.out.println();
            }
            num += 2;
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
                Box_III(num);
                break;
            }
        }
    }
}