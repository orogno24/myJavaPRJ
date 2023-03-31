public class Pyramid0 {

    public static void main(String[] args) {
        int z = 0;
        for (int y = 1; y < 8; y++) {
            if (y < 5) {
                z++;
            } else {
                z--;
            }
            for (int x = 0; x < z; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
