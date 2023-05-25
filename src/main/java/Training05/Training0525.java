package Training05;

import java.util.HashSet;
import java.util.Scanner;

public class Training0525 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner s = new Scanner(System.in);

        System.out.print("5개의 정수를 입력하세요 : ");

        for(int i = 0; i < 5; i++){
            arr[i] = s.nextInt();
        }

        // 중복 제거를 위해 HashSet 사용
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        // HashSet을 배열로 변환하여 저장된 값 출력
        Integer[] distinct = set.toArray(new Integer[0]);

        System.out.print("저장된 값은 ");
        for (int integer : distinct) {
            System.out.printf("%d ", integer);
        }
        System.out.println("입니다.");
    }
}