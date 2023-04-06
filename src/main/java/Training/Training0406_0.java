package Training;

import java.util.Scanner;

public class Training0406_0 {
    public static void main(String[] args) {
        int a, b, c;

        Scanner s = new Scanner(System.in);
        System.out.printf("배열의 길이를 지정하세요 : "); // 배열의 길이를 지정
        a = s.nextInt();
        int arr[] = new int[a];

        int max = arr[0]; // 최대값을 담을 변수 max 선언
        int max2 = 0; // 최대값의 자리를 담을 변수 max2 선언

        for (b = 0; b < arr.length; b++) { // 배열 arr에 원하는 값을 입력
            System.out.printf("배열의 %d칸의 값을 입력하세요 : ", b + 1);
            arr[b] = s.nextInt();
        }

        for (c = 1; c < arr.length; c++) {  //max보다 배열 원소의 값이 크면 그 값을 max에 대입하는 작업을 반복
            if (max < arr[c]) {
                max = arr[c];
                max2 = c;
            }
        }

        System.out.printf("\n \n");

        System.out.printf("배열의 최대값 : %d \n", max);
        System.out.printf("최대값이 있는 자리: %d", max2 + 1);
    }

}
