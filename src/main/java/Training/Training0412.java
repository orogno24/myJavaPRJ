package Training;

import java.util.Scanner;

public class Training0412 {
    public static void main(String[] args) {
        int a, b;
        int hap = 0;
        int[] arr = new int[5];

        Scanner s = new Scanner(System.in);
        for (a = 0; a < arr.length; a++) {
            arr[a] = s.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (b = 0; b < arr.length; b++) {
            if (max < arr[b]) {
                max = arr[b];
            }
            if (min > arr[b]) {
                min = arr[b];
            }
            hap += arr[b];
        }

        System.out.printf("가장 큰 값 : %d / 가장 작은 값 : %d / 평균 값 : %d", max, min, hap / arr.length);
    }
}