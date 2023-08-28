package Zandi_08;

import java.util.ArrayList;

public class Zandi0828 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("ArrayList 크기: " + numbers.size());
        System.out.println("ArrayList 값: " + numbers);

        numbers.set(1, 25);

        System.out.println("변경된 ArrayList 값: " + numbers);

        int value = numbers.get(0);
        System.out.println("첫 번째 값: " + value);

        numbers.remove(2);

        System.out.println("제거 후 ArrayList 값: " + numbers);

        boolean containsValue = numbers.contains(25);
        System.out.println("ArrayList에 25가 포함되어 있는가? " + containsValue);

        numbers.clear();

        System.out.println("비워진 ArrayList 값: " + numbers);
    }
}
