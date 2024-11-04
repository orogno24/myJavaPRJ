package Java2024;

import java.io.*;
import java.util.*;

public class Training_추억점수 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Arrays.toString(solution(
                new String[] {"may", "kein", "kain", "radi"},
                new int[] {5, 10, 1, 3},
                new String[][] {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}}
        )) + "\n");

        bw.write(Arrays.toString(solution(
                new String[] {"kali", "mari", "don"},
                new int[] {11, 1, 55},
                new String[][] {{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}}
        )) + "\n");

        bw.write(Arrays.toString(solution(
                new String[] {"may", "kein", "kain", "radi"},
                new int[] {5, 10, 1, 3},
                new String[][] {{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}}
        )) + "\n");
        bw.flush();
        bw.close();

    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {

        Map<String, Integer> map = new HashMap<>(name.length);
        int[] answer = new int[photo.length];

        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        int count = 0, sum;

        for (String[] arr : photo) {

            sum = 0;

            for (String s : arr) {

                for (String keys : map.keySet()) {
                    if (s.equals(keys)) {
                        sum += map.get(keys);
                    }
                }
            }

            answer[count++] = sum;
        }

        return answer;

    }
}
