package ZanDi06;

import java.util.*;

public class ZanDi0612_9 {
    public static void main(String[] args) {


        System.out.println("ax+by=c 형식의 식을 입력하시오.");
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();

        String[] split = st.split("x");

        String[] split2 = st.split("y");

        String[] split3 = split2[0].split("\\+|-|\\*|/|%");

        System.out.println("1번째 숫자 : " + split[0] + " 2번째 숫자 : " + split3[1]);

    }
}
