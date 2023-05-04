package Quiz;
import java.util.*;
public class Quiz52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set = new HashSet<>(); // HashSet 생성

        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt(); // 정수 입력 받기
            set.add(num); // Set에 추가 (중복된 값은 저장되지 않음)
        }

        // Set 출력
        System.out.print("저장된 값은 ");
        for (int num : set) {
            System.out.print(num + ",");
        }
        System.out.println("입니다.");
    }
    }