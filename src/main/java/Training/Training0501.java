package Training;

public class Training0501 {
    public static void main(String[] args) {

        for (int a = 0; a < 5; a++) {
            for (int b = 0; b < 4 - a; b++) {
                System.out.print(" ");
            }
            for (int c = 0; c < 2 * a - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
