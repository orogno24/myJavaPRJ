package Java2024;

import java.io.*;
import java.util.*;

public class Training_옹알이2 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(solution(new String[]{"aya", "yee", "u", "maa"})));
        bw.newLine();
        bw.write(String.valueOf(solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"})));
        bw.flush();
        bw.close();
    }

    public static int solution(String[] babbling) {

        String[] words = {"aya", "ye", "woo", "ma"};
        StringBuilder sb = new StringBuilder();
        boolean match = false;
        int answer = 0;
        String recentWord = "";

        for (String s : babbling) {

            for (int j = 0; j < s.length(); j++) {

                match = false;
                sb.append(s.charAt(j));

                for (String word : words) {
                    if (sb.toString().equals(word) && !sb.toString().equals(recentWord)) {
                        recentWord = sb.toString();
                        sb.setLength(0);
                        match = true;
                        break;
                    }
                }
            }

            if (match) answer++;
            recentWord = "";
            sb.setLength(0);
        }

        return answer;

    }
}
