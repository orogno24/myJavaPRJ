package ZanDi06;

import java.util.Scanner;

public class ZanDi0628 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int count = 0;

        for (int i = 2; i <= a / 2; i++) {
            if(i % 1 == 0){
                count++;
            }
        }

        System.out.printf("%d", count);

    }


}
