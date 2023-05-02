package Quiz;
import java.util.*;

public class Quiz52_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner 불러오기
        List<Integer> list = new LinkedList<>(); //LinkedList 생성

        int temp; // temp 선언

        for (int i = 0; i < 5; i++) { //for문 생성
            int num = scanner.nextInt(); // 정수 입력
            list.add(num); // 리스트에 추가
        }

        for (int i = 0; i < list.size(); i++) { //list의 크기만큼 반복되는 for문 생성
            for (int j = i + 1; j < list.size(); j++) { //앞선 for문보다 한칸 뒤에서 시작하는 for문 생성
                if (list.get(i) < list.get(j)) { //list.get(j)의 값이 list.get(i)보다 클때 걸리는 조건문
                    temp = list.get(i); //list.get(i)의 값을 temp에 담는다
                    list.set(i, list.get(j)); //list.get(j)의 값과 i의 값을 바꾼다
                    list.set(j, temp); //temp의 값과 list.get(i)의 값을 바꾼다
                }
            }
        }

        for (int num : list) { //list의 길이만큼 반복되는 for문 생성
            System.out.print(num + " "); //list의 값들을 출력
        }
    }
}
