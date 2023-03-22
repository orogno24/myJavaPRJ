import java.util.Scanner;

public class Ex05_06 {
    public static void main(String[] args){

        //내가 만들거나 남이 만든 java파일은 기본 데이터타입처럼 자동으로 메모리에 올려주지 않기 때문에
        //new라고 하는 명령어로 메모리에 올려주어야 사용할 수 있음
        //System = 자바에서 명령을 받아서 받은 값을 메모리에 출력하라는 뜻

        Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("정수를 입력하세요");
        a = s.nextInt();

        if(a % 2 == 0){
            System.out.printf("짝수를 입력했군요..\n");
        } else {
            System.out.printf("홀수를 입력했군요..\n");
        }

    }
}
