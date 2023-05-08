package Training05;

import java.util.Scanner;

public class Training0508 {

    public static int method(int num) {
        int x = 0;

        x = num / 10;

        return x;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = method(x);
        System.out.printf("%d", y);
    }
}
