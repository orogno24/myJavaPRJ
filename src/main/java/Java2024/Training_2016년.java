package Java2024;

import java.io.*;
import java.util.*;

public class Training_2016년 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(solution(5, 24));
        bw.flush();
        bw.close();
    }

    public static String solution(int a, int b) {

        Map<Integer, Integer> map = new HashMap<>(12);
        map.put(0, 0);

        int sum = 0;
        for (int i = 1; i <= 12; i++) {

            if (i == 4 || i == 6 || i == 9 || i == 11) {
                sum += 30;
            } else if (i == 2) {
                sum += 29;
            } else {
                sum += 31;
            }

            map.put(i, sum);

        }

        int dayCount = b + map.get(a - 1);

        String answer = "";
        switch (dayCount % 7) {
            case 0:
                answer = "THU";
                break;
            case 1:
                answer = "FRI";
                break;
            case 2:
                answer = "SAT";
                break;
            case 3:
                answer = "SUN";
                break;
            case 4:
                answer = "MON";
                break;
            case 5:
                answer = "TUE";
                break;
            case 6:
                answer = "WED";
                break;
        }

        return answer;
    }
}
