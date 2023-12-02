package Zandi_09;


import java.util.ArrayList;
import java.util.List;
public class Zandi0916 {
    public static void main(String[] args) {
        // 정수(Integer)를 저장하는 List 생성
        List<Integer> numberList = new ArrayList<>();

        // 요소 추가
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);

        // 요소 접근
        int firstNumber = numberList.get(0);
        int secondNumber = numberList.get(1);

        System.out.println("첫 번째 숫자: " + firstNumber); // 출력: 첫 번째 숫자: 10
        System.out.println("두 번째 숫자: " + secondNumber); // 출력: 두 번째 숫자: 20

        // 요소 수정
        numberList.set(2, 40);
        System.out.println("세 번째 숫자 수정 후: " + numberList.get(2)); // 출력: 세 번째 숫자 수정 후: 40

        // 리스트 크기 확인
        int size = numberList.size();
        System.out.println("리스트 크기: " + size); // 출력: 리스트 크기: 3

        // 리스트 순회
        System.out.print("리스트 요소 순회: ");
        for (int number : numberList) {
            System.out.print(number + " ");
        }
        // 출력: 리스트 요소 순회: 10 20 40

        // 요소 제거
        numberList.remove(1); // 두 번째 요소 제거
        System.out.println("\n두 번째 요소 제거 후: " + numberList); // 출력: 두 번째 요소 제거 후: [10, 40]
    }
}
