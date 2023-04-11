package Training;

import java.util.Scanner;

public class Training0410_2 {
    public static void main(String[] args){
        int a,b,c,e;
        int odd = 0;
        int even = 0;
        System.out.printf("배열의 길이를 입력하세요 : ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();

        int[] arr = new int[a];

        System.out.printf("배열의 원소 %d개를 입력하세요 : ",a);
        for(b=0;b<arr.length;b++){
            c = s.nextInt();
            arr[b] = c;
        }

        for(b=0;b<arr.length;b++){
            if(arr[b]%2 == 0){
                even += 1;
            } else {
                odd += 1;
            }
        }

        System.out.printf("짝수의 개수 : %d 홀수의 개수 : %d",even, odd);

    }

}
