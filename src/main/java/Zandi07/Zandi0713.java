package Zandi07;

import java.util.Scanner;

public class Zandi0713 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 0;
        int[] arr = new int[8];
        System.out.print("숫자를 입력하세요 : ");
        int num = s.nextInt();

        while(num > 0){
            arr[a++] = num % 2;
            num /= 2;
        }

        for(int i = arr.length - 1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
