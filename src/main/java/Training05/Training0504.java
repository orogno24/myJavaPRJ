package Training05;

public class Training0504 {

    public static int dk(int x, int y) {
        y += x;
        return y;
    }

    public static void main(String[] args) {
        int z = 0;
        for (int a = 1; a <= 10; a++) {
            z = dk(a, z);
        }
        System.out.printf("%d", z);
    }
}
