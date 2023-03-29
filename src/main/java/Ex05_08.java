import java.util.Scanner;

public class Ex05_08 {
    public static void main(String[] args){
        //new 함수를 이용해서 시스템 메모리(RAM)위에 올려서 볼 수 있게해줌
        Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("점수를 입력하세요");
        a = s.nextInt();
        //else if를 쓰는 경우는 공통된 변수의 조건이 여러 개인 경우에만 가능, 해당 if문에선 a만을 사용하므로 else if 사용
        if (a >= 90) {
            System.out.printf("A");
        } else if (a >= 80) {
            System.out.printf("B");
        } else if (a >= 70) {
            System.out.printf("C");
        } else if (a >= 60) {
            System.out.printf("D");
        } else {
            System.out.printf("F");
        }

        System.out.printf(" 학점 입니다.\n");
    }
}
