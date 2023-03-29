public class Ex06_99 {

    public static void main(String[] args) {
        int i, k;

        for (i = 2; i <= 9; i++) {
            for (k = 1; k <= 9; k++) {
                System.out.printf("%d * %d = %d\n", i, k, i*k);
            }
        }
    }
}
