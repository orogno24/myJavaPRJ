import java.util.*;

public class Ex09_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;

        System.out.print("문자열 입력 ==> ");
        str = s.nextLine();

        System.out.print("출력 문자열 ==> ");

        System.out.println("내가 사용한 함수 : " + str.replaceAll("o", "q"));
    }
}
