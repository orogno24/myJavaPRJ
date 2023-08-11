package Zandi_08;

import java.util.HashMap;

public class Zandi0811 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("b", 3);

        System.out.println("Map Value : " + map.get("b"));

        System.out.println("Map size : " + map.size());

        map.replace("b", 4);
        System.out.println("b Value : " + map.get("b"));

        System.out.println("Key Exist : " + map.containsKey("b"));
        System.out.println("Value Exist : " + map.containsValue(4));

        System.out.println("Map Empty : " + map.isEmpty());

        map.remove("b");
    }
}
