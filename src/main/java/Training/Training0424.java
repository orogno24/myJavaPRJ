package Training;

import java.util.Scanner;

public class Training0424 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("연도를 입력하세요. : ");
        int a = s.nextInt();

        if(a%4 == 0 && a % 100 !=0) {
            System.out.printf("%d 년은 윤년입니다.",a);
        } else if (a%400 == 0){
            System.out.printf("%d 년은 윤년입니다.",a);
        } else{
            System.out.printf("%d 년은 윤년이 아닙니다.",a);
        }
    }
}
