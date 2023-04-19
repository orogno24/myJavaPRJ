package Training;

import java.util.Scanner;

public class Training0418_0 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int temp;
        Scanner s = new Scanner(System.in);
        System.out.print("5개의 정수를 입력하세요 : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i] < arr[k]) {
                    temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
            System.out.printf("%d ", arr[i]);
        }

    }
}
