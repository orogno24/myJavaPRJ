package Training05;

import java.util.Scanner;

public class Training0516 {
    public static int func(int a, int b, int c){
        int result = 0;

        switch (c){
            case 1 : result = a + b; break;
            case 2 : result = a - b; break;
            case 3 : result = a * b; break;
            case 4 : result = a / b; break;
        }

        return result;
    }
    public static void sx(){
        String log ="123.123.123.123 - - [12/Apr/2018:17:03:50 +0900] \"GET /api/aaaa HTTP/1.1\" 200 34 1468 \"https://m.naver.com\" \"Mozilla/5.0 (iPhone; CPU iPhone OS 11_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E216 NAVER(inapp; search; 580; 8.6.3; 7)\"";

        String[] split = log.split(" ");
        System.out.println("ip는 : " + split[0]);

        String str = split[3];
        String str2 = str.replace("[", "");
        System.out.println("호출시간은 : " + str2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("1 : 메소드 func 2 : 메소드 sx\n");
        System.out.print("둘중 하나를 선택하세요 : ");

        int x = s.nextInt();

        switch (x){
            case 1 :
                System.out.print("정수를 입력하세요");
                int a = s.nextInt();
                System.out.print("정수를 입력하세요");
                int b = s.nextInt();
                System.out.print("1 : 더하기 2 : 빼기 3 : 곱하기 4 : 나누기");
                int c = s.nextInt();

                int result = func(a, b, c);

                System.out.printf("계산 결과는 %d 입니다.", result);
                break;
            case 2 :
                sx();
        }
    }
}
