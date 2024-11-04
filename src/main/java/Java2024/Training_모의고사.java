package Java2024;

import java.io.*;
import java.util.*;

public class Training_모의고사 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        bw.newLine();
        bw.write(Arrays.toString(solution(new int[]{1, 3, 2, 4, 2})));
        bw.flush();
        bw.close();
    }

    public static int[] solution(int[] answers) {

        List<Integer> list = new ArrayList<>(3);
        Map<Integer, Integer> map = new HashMap<>(3);

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int aCount = 0, bCount = 0, cCOunt = 0;

        for (int j : answers) {

            if (j == a[aCount++]) {
                map.put(1, map.getOrDefault(1, 0) + 1);
            }
            if (j == b[bCount++]) {
                map.put(2, map.getOrDefault(2, 0) + 1);
            }
            if (j == c[cCOunt++]) {
                map.put(3, map.getOrDefault(3, 0) + 1);
            }

            if (aCount == a.length) aCount = 0;
            if (bCount == b.length) bCount = 0;
            if (cCOunt == c.length) cCOunt = 0;

        }

        int max = Collections.max(map.values());

        for (int key : map.keySet()) {
            if (max == map.get(key)) {
                list.add(key);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) == null)) {
                answer[i] = list.get(i);
            }
        }

        return answer;

    }

}
