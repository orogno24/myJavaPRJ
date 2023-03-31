public class Quiz6 {

    public static void main(String[] args) {
        int x, y, z;

        for (x = 2, y = 1, z = 1; z < 73; x++, z++) {


            if (x > 9) {
                x = 2;
                y++;
                System.out.println("");
            }

            System.out.printf("%d * %d = %2d ", x, y, x * y);
        }
    }
}
