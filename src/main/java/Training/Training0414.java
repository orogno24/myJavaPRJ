package Training;

import java.util.Scanner;

public class Training0414 {
    public static void main(String[] args) {
        System.out.print("배열의 길이를 입력하세요 : ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            while (arr[i] % 3 == 0 || arr[i] % 10 == 3 || arr[i] / 10 == 3) {
                for (int j = i; j < arr.length; j++) {
                    arr[j]++;
                }
            }
            System.out.printf("%d ", arr[i]);
        }
    }
}
