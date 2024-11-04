package Java2024;

import java.io.*;
import java.util.*;

public class Training_과일장수 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Integer.toString(solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1})));
        bw.newLine();
        bw.write(Integer.toString(solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2})));
        bw.flush();
        bw.close();
    }

    public static int solution(int k, int m, int[] score) {

        List<Integer> list = new ArrayList<>();
        int answer = 0;

        for (int i : score) {
            list.add(i);
        }

        list.sort(Collections.reverseOrder());

        for (int i = m - 1; i < list.size(); i += m) {
            answer += list.get(i) * m;
        }

        return answer;

    }
}
