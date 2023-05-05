package Quiz;

import java.util.Scanner;

public class Quiz46 {
    public static void main(String[] args) {
        int num, b, c, d, x, temp;
        Scanner s = new Scanner(System.in);
        int arr[] = new int[5];
        int state = 0;

        System.out.print("5자리 숫자를 입력하세요 : ");
        num = s.nextInt();

        while (num != 0){
            for (x = 0; x < arr.length; x++) {
                arr[x] = num % 10;
                num /= 10;
            }
        }

        for (b = 0; b < arr.length; b++) {
            for (d = b + 1; d < arr.length; d++) {
                if (arr[b] == arr[d]) {
                    System.out.print("중복된 숫자가 감지되었습니다!");
                    b = arr.length;
                    d = arr.length;
                    state = 1;
                }
            }
        }

        for (c = 0; c < arr.length; c++) {
            for (d = c + 1; d < arr.length; d++) {
                if (state == 0) {
                    if (arr[c] > arr[d]) {
                        temp = arr[c];
                        arr[c] = arr[d];
                        arr[d] = temp;
                    }
                }
            }
        }

        if (state == 0) {
            System.out.print("정렬된 숫자는 ");
            for (d = 0; d < arr.length; d++) {
                System.out.print(arr[d]);
            }
            System.out.print(" 입니다!");
        }
    }
}