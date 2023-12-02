package Zandi_08;

import java.util.HashMap;

public class Zandi0825 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Alice", 85);
        studentScores.put("Bob", 92);
        studentScores.put("Charlie", 78);
        studentScores.put("David", 95);

        String studentName = "Bob";
        if (studentScores.containsKey(studentName)) {
            int score = studentScores.get(studentName);
            System.out.println(studentName + "의 점수: " + score);
        } else {
            System.out.println(studentName + "의 점수를 찾을 수 없습니다.");
        }

        for (String name : studentScores.keySet()) {
            int score = studentScores.get(name);
            System.out.println(name + ": " + score);
        }
    }
}
