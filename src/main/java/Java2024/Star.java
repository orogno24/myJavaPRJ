package Java2024;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("홀수 크기를 입력하세요: ");
        int size = sc.nextInt();

        // 홀수 입력 검증
        if (size % 2 == 0) {
            System.out.println("홀수를 입력해야 합니다.");
            return;
        }

        int mid = size / 2;

        for (int row = 0; row < size; row++) {
            int stars = row <= mid ? row : size - 1 - row;

            for (int col = 0; col < size; col++) {
                if (col >= mid - stars && col <= mid + stars) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
