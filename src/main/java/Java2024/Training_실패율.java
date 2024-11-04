package Java2024;

import java.io.*;
import java.util.*;

public class Training_실패율 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Arrays.toString(solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})));
        bw.newLine();
        bw.write(Arrays.toString(solution(4, new int[]{4, 4, 4, 4, 4})));
        bw.flush();
        bw.close();
    }

    public static int[] solution(int N, int[] stages) {

        int[] answer = new int[N];
        Map<Integer, Double> map = new HashMap<>();

        double[] perArr = new double[N];

        for (int i = 1; i <= N; i++) {
            map.put(i, 0.0);
        }

        for (int stage : stages) {
            if (stage <= N) {
                map.put(stage, map.get(stage) + 1);
            }
        }

        int size = stages.length;
        List<int[]> failureRates = new ArrayList<>();

        int count = 0;
        for (Map.Entry<Integer, Double> entry : map.entrySet()) {
            double per = entry.getValue() / size;
            perArr[count++] = per;
            size -= entry.getValue();
            map.put(entry.getKey(), per);
        }

        List<Double> list = new ArrayList<>(perArr.length);

        for (double d : perArr) {
            list.add(d);
        }
        list.sort(Collections.reverseOrder());

        for (int i : map.keySet()) {
            for (int j = 0; j< list.size(); j++) {
                if (Objects.equals(map.get(i), list.get(j)) && answer[j] == 0) {
                    answer[j] = i;
                    break;
                }
            }
        }

        return answer;

    }

    static class StageFailureRate {
        int stage;
        double failureRate;

        StageFailureRate(int stage, double failureRate) {
            this.stage = stage;
            this.failureRate = failureRate;
        }
    }
}
