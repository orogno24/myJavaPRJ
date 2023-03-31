public class Pyramid2 {

    public static void main(String[] args) {

        for (int Y = 1, Z = 1; Y < 6; Y++, Z++) {

            switch (Z) {
                case 1:
                    System.out.print("*\n");
                    break;
                case 2:
                    System.out.print("**\n");
                    break;
                case 3:
                    System.out.print("***\n");
                    break;
                case 4:
                    System.out.print("****\n");
                    break;
                case 5:
                    System.out.print("*****\n");
                    break;
            }
        }
    }
}
