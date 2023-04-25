package Training;

public class Training0425_0 {
    public static void main(String[] args) {
        int x, y;

        for (x = 1, y = 1; x < 6; y++) {
            System.out.print("*");
            if (x == y) {
                x++;
                y = 0;
                System.out.println();
            }
        }

    }
}