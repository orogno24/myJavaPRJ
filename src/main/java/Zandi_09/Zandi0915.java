package Zandi_09;

import java.util.*;

public class Zandi0915 {
    public static void main(String[] args) {
        Map<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Alice", 95);
        studentScores.put("Bob", 88);
        studentScores.put("Charlie", 78);
        studentScores.put("David", 92);

        int aliceScore = studentScores.get("Alice");
        System.out.println("Alice's Score: " + aliceScore);

        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();
            System.out.println(name + "'s Score: " + score);
        }

        boolean hasKey = studentScores.containsKey("Eve");
        System.out.println("Does Eve exist in the map? " + hasKey);

        studentScores.remove("Charlie");

        int mapSize = studentScores.size();
        System.out.println("Map Size: " + mapSize);
    }
}
