package Training05;

import java.util.Scanner;

public class Training0523 {

    public static void gob(int a) {

        for (int i = 1; i < 10; i++) {
            System.out.printf("%2d X %2d = %2d", a, i, a * i);
        }

    }

    public static void sx(){
        String x ="123.123.123.123 - - [12/Apr/2018:17:03:50 +0900] \"GET /api/aaaa HTTP/1.1\" 200 34 1468 \"https://m.naver.com\" \"Mozilla/5.0 (iPhone; CPU iPhone OS 11_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E216 NAVER(inapp; search; 580; 8.6.3; 7)\"";

        String[] split = x.split(" ");
        System.out.println("ip는 : " + split[0]);

        String str = split[3];
        String str2 = str.replace("[", "");
        System.out.println("호출시간은 : " + str2);
    }

    public static void main(String[] args) {
        System.out.print("입력할 단수를 선택하세요 : ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        gob(a);
        sx();
    }

}
