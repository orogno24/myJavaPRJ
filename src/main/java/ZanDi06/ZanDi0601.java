package ZanDi06;

import java.util.Scanner;



public class ZanDi0601 {
    public static void main(String[] args) {

        System.out.println("Quiz) DELETE, SELECT, DIVISION, JOIN 즁 순수 관계 연산자에 해당하지 않는 것을 대문자로 입력하시오 : ");

        Scanner s = new Scanner(System.in);
        String st = s.nextLine();

        switch (st){
            case "DELETE":
                System.out.print("정답입니다.");
                break;
            case "SELECT":
            case "DIVISION":
            case "JOIN":
                System.out.print("정답이 아닙니다.");
                break;
        }
    }
}
