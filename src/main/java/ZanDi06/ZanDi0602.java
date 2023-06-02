package ZanDi06;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ZanDi0602 {
    public static void main(String[] args) {
        LinkedList<Integer> arr2 = new LinkedList<>();

        Scanner s = new Scanner(System.in);
        System.out.print("5개의 정수를 입력하세요: ");

        for (int i = 0; i < 5; i++) {
            int num = s.nextInt();
            arr2.add(num);
        }

        Collections.sort(arr2);

        System.out.print("오름차순을 원하시면 1, 내림차순을 원하시면 2를 입력해 주세요 : ");
        int order = s.nextInt();

        if (order == 1) {
            for (int i : arr2) {
                System.out.print(i + " ");
            }
        } else if (order == 2) {
            for (int i = arr2.size() - 1; i >= 0; i--) {
                System.out.print(arr2.get(i) + " ");
            }
        } else {
            System.out.print("잘못 입력하셨습니다.");
        }
    }
}

