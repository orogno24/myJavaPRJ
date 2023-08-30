package Zandi_08;

import java.util.HashMap;
import java.util.Map;

public class Zandi0830 {
    public static void main(String[] args) {
        Map<String, Integer> ageMap = new HashMap<>();

        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 28);
        ageMap.put("David", 22);

        String nameToSearch = "Bob";
        if (ageMap.containsKey(nameToSearch)) {
            int age = ageMap.get(nameToSearch);
            System.out.println(nameToSearch + "의 나이: " + age);
        } else {
            System.out.println(nameToSearch + "에 대한 정보를 찾을 수 없습니다.");
        }

        System.out.println("모든 이름과 나이:");
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            String name = entry.getKey();
            int age = entry.getValue();
            System.out.println(name + ": " + age);
        }

        String nameToUpdate = "Charlie";
        int newAge = 29;
        ageMap.put(nameToUpdate, newAge);
        System.out.println(nameToUpdate + "의 나이가 수정되었습니다.");

        String nameToRemove = "David";
        ageMap.remove(nameToRemove);
        System.out.println(nameToRemove + "의 정보가 삭제되었습니다.");

        boolean isEmpty = ageMap.isEmpty();
        System.out.println("Map이 비어있는가? " + isEmpty);

        int size = ageMap.size();
        System.out.println("Map의 크기: " + size);
    }
}
