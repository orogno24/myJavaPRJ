package Training05;

import java.util.Scanner;

public class Training0530 {
    public static void main(String[] args) {

        System.out.println("Quiz) SQL에서 권한을 회수할 때 사용하는 명령어는? : ");

        Scanner s = new Scanner(System.in);
        String st = s.nextLine();

        switch (st){
            case "revoke" :
            case "REVOKE" :
                System.out.print("정답입니다.");
                break;
            default:
                System.out.print("정답이 아닙니다.");
        }
    }
}
