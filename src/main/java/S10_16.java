import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class S10_16 {

    public static void wordMaxCount(String word) {

        Map<Character, Integer> map = new HashMap<>();

        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        wordMaxCount(word);
    }
}
