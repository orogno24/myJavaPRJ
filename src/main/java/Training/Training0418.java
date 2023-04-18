package Training;

import java.util.Scanner;

public class Training0418 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("배열의 길이를 입력하세요 : ");
        int a = s.nextInt();
        int[] arr = new int[a];

        System.out.print("배열의 값을 입력하세요 : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt()*2;
        }

        System.out.print("배열의 값의 2배는 : ");
        for(int i = 0; i < arr.length; i++){
            System.out.printf("%d ",arr[i]);
        }
        System.out.print("입니다.");
    }
}
