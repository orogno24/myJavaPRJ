package ZanDi06;

import java.util.*;

public class ZanDi0608 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();

        System.out.print("입력값: ");
        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        System.out.print("저장된 값: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\n출력 메시지: 저장된 값은 " + numbers.size() + "개입니다.");
    }

}

