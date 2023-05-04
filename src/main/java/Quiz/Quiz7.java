package Quiz;

public class Quiz7 {

    public static void main(String[] args) {

        int x, y;

        for (x = 1, y = 1; y < 6; x++) {

            System.out.printf("*");

            if (x >= y) {
                x = 0;
                y++;
                System.out.println();
            }
        }
    }
}
