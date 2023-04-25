package Training;

import java.util.Scanner;

public class Training0425_0 {
    public static void main(String[] args) {
        int z = 0;
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        for(int y = 0; y < a; y++){
            if (y < a-a/2) {
                z++;
            } else {
                z--;
            }
            for(int x = 0; x < z; x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}