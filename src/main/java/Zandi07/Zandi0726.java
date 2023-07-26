package Zandi07;

import java.util.Scanner;

public class Zandi0726 {

    public static int push(int i) {
        if(i == 0 || i == 1){
            return 1;
        } else {
            return i * push(i - 1);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("값을 입력하세요 : ");
        int num = s.nextInt();

        int result = push(num);
        System.out.printf("결과값은 %d입니다.",result);
    }
}
