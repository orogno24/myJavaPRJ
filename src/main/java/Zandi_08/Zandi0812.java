package Zandi_08;

import java.util.Scanner;

class Zandi0812 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] arr = new int[num];
        int hap = 0;

        for(int i = 0; i < num; i++){
            arr[i] = s.nextInt();
            hap += arr[i];
        }

        for(int i = 0; i < num; i++){
            for(int k = i + 1; k < num; k++){
                int a = arr[i] + arr[k];
                if(a == hap - 100){
                    arr[i] = 0;
                    arr[k] = 0;
                }
            }
        }

        for(int i = 0; i < num; i++){
            if(arr[i] == 0){
                System.out.print("");
            } else System.out.println(arr[i]);
        }
    }
}