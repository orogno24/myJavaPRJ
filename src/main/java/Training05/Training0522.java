package Training05;

import java.util.Scanner;

public class Training0522 {

    public static int gob2(int x) {

        int a = 0;

        for (int i = 0; i < x; i++) {
            if (i * i == x) {
                a = 1;
                break;
            } else {
                a = 2;
            }
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int x = s.nextInt();

        switch (gob2(x)) {
            case 1:
                System.out.printf("%d는 제곱수입니다.", x);
                break;
            case 2:
                System.out.printf("%d는 제곱수가 아닙니다.", x);
        }
    }
}
