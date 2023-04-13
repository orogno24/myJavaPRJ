package Training;

import java.util.Scanner;

public class Training0413 {
    public static void main(String[] args) {
        int[] arr = new int [5];
        int[] count = new int [5];

        Scanner s = new Scanner(System.in);
        System.out.print("배열의 값 5개를 입력하세요 : ");
        for(int i = 0;i < arr.length;i++){
            arr[i] = s.nextInt();
            count[arr[i]-1]++;
        }

        System.out.print("번호가 불린 횟수 : ");
        for(int i = 0;i < arr.length;i++){
            System.out.print(count[i]);
        }
    }
}
