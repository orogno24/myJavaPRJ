public class Quiz4 {

    public static void main(String[] args) {
        int x, y, z;

        for (x = 1, y = 2, z = 1; z < 73; y++, z++) {


            if (y > 9) {
                x++;
                y = 2;
                System.out.println("");
            }

            System.out.printf("%d * %d = %2d ", y, x, x * y);
        }
    }
}
