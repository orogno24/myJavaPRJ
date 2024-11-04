package Java2024;

import java.io.*;
import java.util.*;

public class Training_소수만들기 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(solution(new int[]{1, 2, 3, 4})));
        bw.newLine();
        bw.write(String.valueOf(solution(new int[]{1, 2, 7, 6, 4})));
        bw.flush();
        bw.close();
    }

    public static int solution(int[] nums) {

        int answer = 0;

        for (int x = 0; x < nums.length - 2; x++) {
            for (int y = x + 1; y < nums.length - 1; y++) {
                for (int z = y + 1; z < nums.length; z++) {
                    if (isPrime(nums[x] + nums[y] + nums[z])) answer++;
                }
            }
        }

        return answer;
    }

    public static boolean isPrime(int num) {

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
