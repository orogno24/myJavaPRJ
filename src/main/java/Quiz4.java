public class Quiz4 {

    public static void main(String[] args) {
        int i, k;

        for (i = 1; i <= 9; i++) {
            for (k = 2; k <= 9; k++) {
                System.out.printf("%d * %d = %2d ", k, i, i * k);
            }
            System.out.println("");
        }
    }
}
