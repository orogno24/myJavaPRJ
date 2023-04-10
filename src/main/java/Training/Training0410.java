package Training;

import java.util.Scanner;

public class Training0410 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("출석 번호를 부를 횟수를 입력하세요 : ");

        int a,b,c,d,e,x,z;
        a = s.nextInt();

        int[] arr = new int[a];
        int[] arr2 = new int[a];
        int[] arr3 = new int[a];

        //순서대로 출력
        for (b = 0; b < arr.length; b++) {    //1,2,3,4,5 순으로 출력하는  배열 arr 생성
            arr[b] = b+1;
        }

        System.out.println();
        System.out.print("순서대로 출력 : ");
        for (c = 0; c < arr.length; c++) {
            System.out.print(arr[c] + " ");
        }

        //출석번호를 무작위로 출력
        for (int m = 0; m < arr.length; m++) {     //1 ~ a의 값까지 무작위로 출력하는 배열 arr2 생성
            arr2[m] = (int) (Math.random() * a) + 1;
        }

        System.out.print("\n\n");
        System.out.print("출석번호를 무작위로 출력 : "); // 배열 arr2를 그대로 출력한다
        for (d = 0; d < arr2.length; d++) {
            System.out.print(arr2[d] + " ");
        }

        //번호가 불린 횟수를 순서대로 출력
        for( z = 0; z < arr.length; z++) {         // 이중 for문으로 arr과 arr2를 비교하여 arr3에 +1을 하는 작업 반복
            for (x = 0; x < arr.length; x++) {
                if (arr[z] == arr2[x]) {
                    arr3[z] += 1;
                }
            }
        }
        System.out.print("\n\n");
        System.out.print("번호가 불린 횟수를 순서대로 출력 : "); // 배열 arr3을 그대로 출력한다
        for (e = 0; e < arr3.length; e++) {
            System.out.print(arr3[e] + " ");
        }
        System.out.print("\n\n");
    }
}
