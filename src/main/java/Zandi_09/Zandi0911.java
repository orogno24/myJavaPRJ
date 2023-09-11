package Zandi_09;

import java.util.LinkedList;

public class Zandi0911 {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("사과");
        linkedList.add("바나나");
        linkedList.add("체리");

        System.out.println("LinkedList 요소:");

        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        linkedList.add(1, "포도");
        linkedList.set(2, "딸기");
        linkedList.remove("바나나");

        System.out.println("LinkedList 크기: " + linkedList.size());

        if (linkedList.contains("딸기")) {
            System.out.println("딸기를 찾았습니다!");
        } else {
            System.out.println("딸기를 찾지 못했습니다.");
        }

    }
}
