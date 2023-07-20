package Zandi07;

import java.util.Scanner;

public class Zandi0720 {

    static int[] aliquot(int n) {
        int[] arr = new int[10];
        int c = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) {
                arr[c] = i;
                c++;
            }
        return arr;
    }

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr2 = aliquot(n);
        for (int i : arr2) {
            if (i == 0) break;
            System.out.printf("%d ", i);
        }
    }
}
