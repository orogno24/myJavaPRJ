package Java2024;

import java.util.Arrays;


public class Sort {
    public static void main(String[] args) {

        int[] arr = {69, 10, 30, 2, 16, 8, 31, 22};

        System.out.println(Arrays.toString(삽입정렬(arr)));

    }

    public static int[] 버블정렬(int[] arr) {
        int temp;
        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = 0; y < arr.length - 1; y++) {
                if (arr[y] > arr[y + 1]) {
                    temp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] 선택정렬(int[] arr) {

        for (int x = 0; x < arr.length - 1; x++) {
            int minIdx = x;
            for (int y = x + 1; y < arr.length; y++) {
                if (arr[y] < arr[minIdx]) {
                    minIdx = y;
                }
            }
            int temp = arr[x];
            arr[x] = arr[minIdx];
            arr[minIdx] = temp;
        }

        return arr;
    }

    public static int[] 삽입정렬(int[] arr) {

        for (int x = 1; x < arr.length; x++) {

            int current = arr[x];
            int y = x - 1;

            while (y >= 0 && arr[y] > current) {
                arr[y + 1] = arr[y];
                y--;
            }

            arr[y + 1] = current;

        }
        
        return arr;
    }

}
