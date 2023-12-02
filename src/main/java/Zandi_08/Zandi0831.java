package Zandi_08;

import java.util.HashMap;
import java.util.Map;

public class Zandi0831 {
    public static void main(String[] args) {
        Map<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Alice", 95);
        studentScores.put("Bob", 87);
        studentScores.put("Charlie", 92);
        studentScores.put("David", 78);

        System.out.println("Alice's score: " + studentScores.get("Alice"));

        for (String name : studentScores.keySet()) {
            System.out.println(name + ": " + studentScores.get(name));
        }

        for (Integer score : studentScores.values()) {
            System.out.println("Score: " + score);
        }

        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        studentScores.put("Alice", 98);
        studentScores.remove("Charlie");

        System.out.println("Is map empty? " + studentScores.isEmpty());
        System.out.println("Does map contain key 'Bob'? " + studentScores.containsKey("Bob"));
        System.out.println("Does map contain value 78? " + studentScores.containsValue(78));
        System.out.println("Map size: " + studentScores.size());

        studentScores.clear();
    }
}
