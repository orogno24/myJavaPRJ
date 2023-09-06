package Zandi_09;

import java.util.Map;

public class Zandi0906 {
    public static void main(String[] args) {
        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 87);
        studentScores.put("Charlie", 92);
        studentScores.put("David", 78);

        System.out.println("Alice의 점수: " + studentScores.get("Alice"));
        System.out.println("Bob의 점수: " + studentScores.get("Bob"));
        System.out.println("Charlie의 점수: " + studentScores.get("Charlie"));
        System.out.println("David의 점수: " + studentScores.get("David"));

        studentScores.put("Bob", 88);

        System.out.println("Bob의 업데이트된 점수: " + studentScores.get("Bob"));

        System.out.println("HashMap 크기: " + studentScores.size());

        studentScores.remove("David");

        System.out.println("David의 점수 (제거 후): " + studentScores.get("David"));

        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
