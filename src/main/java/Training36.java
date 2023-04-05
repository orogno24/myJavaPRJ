import java.util.Scanner;

public class Training36 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 0;
        x = s.nextInt();

        int y = 0;
        while (x != 0) {
            if (x % 10 == 3 || x % 10 == 6 || x % 10 == 9) {
                y++;
            }
            x /= 10;
        }

        System.out.print(y);
    }
}