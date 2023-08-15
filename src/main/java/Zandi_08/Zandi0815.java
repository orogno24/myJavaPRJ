package Zandi_08;

import java.util.Scanner;

public class Zandi0815 {

    public void Triangle(int[] arr){
        if (arr[0] != 0 && arr[1] != 0 && arr[2] != 0) {
            if (Math.pow(arr[0], 2) == Math.pow(arr[1], 2) + Math.pow(arr[2], 2)) {
                System.out.print("right");
            } else if (Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2)) {
                System.out.print("right");
            } else if (Math.pow(arr[0], 2) + Math.pow(arr[2], 2) == Math.pow(arr[1], 2)) {
                System.out.print("right");
            } else System.out.print("wrong");
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] arr = new int[3];

        for(int i = 0; i < 3; i++){
            arr[i] = s.nextInt();
        }

        Zandi0815 zand = new Zandi0815();

        zand.Triangle(arr);

    }

 }