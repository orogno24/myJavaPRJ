package Training05;

import java.util.Scanner;

public class Training0512_2 {
    public static int sosu(int a) {
        int b = 0;

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                b++;
            }
        }

        return b == 2 ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int num = s.nextInt();

        switch (sosu(num)) {
            case 0:
                System.out.printf("%d : 소수가 아닙니다.", num);
                break;
            case 1:
                System.out.printf("%d : 소수입니다.", num);
                break;
        }
    }
}
