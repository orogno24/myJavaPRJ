import java.util.*;

public class S10_17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        wordFreqCount(input);
    }

    public static void wordFreqCount(String input) {
        Map<Character, Integer> hashMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
