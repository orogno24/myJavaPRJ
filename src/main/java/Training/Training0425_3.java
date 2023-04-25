package Training;

import java.util.Scanner;

public class Training0425_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        int temp;

        for (int a = 0; a < arr.length; a++) {
            arr[a] = s.nextInt();
            for (int b = 0; b < a; b++) {
                if (arr[a] == arr[b]) {
                    System.out.print("중복!");
                    a--;
                    break;
                }
            }
        }

        for (int b = 0; b < arr.length; b++) {
            for (int c = b + 1; c < arr.length; c++) {
                if (arr[b] > arr[c]) {
                    temp = arr[c];
                    arr[c] = arr[b];
                    arr[b] = temp;
                }
            }
        }

        for (int c = 0; c < arr.length; c++) {
            System.out.printf("%d ", arr[c]);
        }
    }
}