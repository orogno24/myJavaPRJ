package Training;

import java.util.Scanner;

public class Training0417_3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("배열의 길이를 입력하세요 : ");
        int a = s.nextInt();
        int x;
        int[] arr = new int[a];

        System.out.print("배열의 값을 입력하세요 : ");
        for(int i = 0;i<a;i++){
            arr[i] = s.nextInt();

        }

        for(int i = arr.length-1;i >= 0;i--){
            System.out.printf("%d ", arr[i]);
        }

    }
}
