package ZanDi06;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ZanDi0620 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        System.out.print("input: ");
        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            set.add(number);
        }

        System.out.print("output: ");
        for (int num : set) {
            System.out.print(num + " ");
        }

        System.out.println("size : " + set.size());
    }

}
