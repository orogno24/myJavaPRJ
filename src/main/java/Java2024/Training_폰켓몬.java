package Java2024;

import java.io.*;
import java.util.*;

public class Training_폰켓몬 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Integer.toString(solution(new int[]{3, 1, 2, 3})) + "\n");
        bw.write(Integer.toString(solution(new int[]{3, 3, 3, 2, 2, 4})) + "\n");
        bw.write(Integer.toString(solution(new int[]{3, 3, 3, 2, 2, 2})) + "\n");

        bw.flush();
        bw.close();
    }

    public static int solution(int[] nums) {

        Set<Integer> numSet = new LinkedHashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }

        return Math.min(nums.length / 2, numSet.size());
    }
}
