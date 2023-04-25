package Training;

import java.util.Scanner;

public class Training0425_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("배열의 길이를 입력하세요 : ");
        int a = s.nextInt();
        int temp;
        int[] arr = new int[a];

        System.out.print("배열의 값을 입력하세요 : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            for(int k = i+1; k < arr.length; k++){
                if(arr[i] < arr[k]){
                    temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}
