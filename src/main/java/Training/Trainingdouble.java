package Training;

import java.util.Scanner;

public class Trainingdouble {

    public static void main(String[] args) {
        int x, y, count, i, j;
        int state = 0;
        int[][] arr = new int[19][19];

        System.out.print("좌표를 지정할 횟수를 선택하세요 : ");
        Scanner s = new Scanner(System.in);
        count = s.nextInt();

        if (1 > count || count > 10) {
            System.out.print("1 ~ 10 사이의 값을 입력해야 합니다.");
            state = 1;
            count = 0;
        }

        while (count != 0) {

            System.out.print("x 좌표를 입력하세요 : ");
            x = s.nextInt();
            x = x - 1;

            if (x < 0 || x > 18) {
                System.out.print("1 ~ 19 사이의 값을 입력해야 합니다.\n");
                state = 1;
                break;
            }

            System.out.print("y 좌표를 입력하세요 : ");
            y = s.nextInt();
            y = y - 1;

            if (y < 0 || y > 18) {
                System.out.print("1 ~ 19 사이의 값을 입력해야 합니다.\n");
                state = 1;
                count = 0;
            }

            if (state == 0) {

                for (j = 0; j < arr.length; j++) {
                    if (arr[x][j] == 0) {
                        arr[x][j] = 1;
//                        if (j == y) {
//                            arr[x][j] = 0;
//                        }
                    }
//                    else {
//                        arr[x][j] = 0;
//                    }
                }
                for (j = 0; j < arr.length; j++) {
                    if (arr[j][y] == 0) {
                        arr[j][y] = 1;
                    }
//                    else {
//                        arr[j][y] = 0;
//                    }
                }
                count--;
            }
        }

        if (state == 0) {
            for (i = 0; i < arr.length; i++) {
                for (j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}