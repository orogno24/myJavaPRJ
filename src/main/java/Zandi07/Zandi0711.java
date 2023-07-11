package Zandi07;

public class Zandi0711 {
    public static void main(String[] args) {
        int num[] = {14, 42 ,37, 28 ,6};

        for(int i : num){
            switch (i%5) {
                case 1:
                    System.out.printf("A");
                    break;
                case 2:
                    System.out.printf("B");
                    break;
                case 3:
                    System.out.printf("C");
                    break;
                case 4:
                    System.out.printf("D");
                    break;
                default:
                    System.out.printf("\n");
            }
        }
    }
}
