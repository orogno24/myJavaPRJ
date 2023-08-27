package Zandi_08;

import java.util.HashSet;

public class Zandi0827 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice");

        System.out.println("HashSet의 크기: " + names.size());

        System.out.println("HashSet의 요소:");
        for (String name : names) {
            System.out.println(name);
        }

        names.remove("Bob");

        System.out.println("HashSet에 Bob이 있는가? " + names.contains("Bob"));
    }
}
