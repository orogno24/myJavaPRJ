package Training;

import java.util.Scanner;

public class Training0417 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int x, y;

        Scanner s = new Scanner(System.in);
        int count = 0;

        System.out.print("5개의 숫자를 입력하세요 : ");
        for (x = 0; x < arr.length; x++) {
            arr[x] = s.nextInt();
        }

        for (x = 0; x < arr.length; x++) {
            for (y = x + 1; y < arr.length; y++) {
                if (arr[x] == arr[y]) {
                    arr[y] = 999;
                }
            }
            if (arr[x] != 999) {
                count++;
            }
        }

        int[] arr2 = new int[count];

        System.out.print("저장된 값은");

        for (x = 0, y = 0; x < arr2.length; x++, y++) {

            if (arr[x] == 999) {
                y++;
            }

            arr2[x] = arr[y];

            System.out.printf(" %d", arr2[x]);
        }

        System.out.print("입니다.");
    }
}