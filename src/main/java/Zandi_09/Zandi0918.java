package Zandi_09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zandi0918 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문장을 입력하세요: ");
        String inputSentence = scanner.nextLine();
        scanner.close();

        String[] words = inputSentence.split(" ");
        List<String> wordList = new ArrayList<>();

        for (String word : words) {
            wordList.add(word);
        }

        List<String> reversedWords = new ArrayList<>();
        for (String word : wordList) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversedWords.add(reversedWord.toString());
        }

        StringBuilder reversedSentence = new StringBuilder();
        for (String reversedWord : reversedWords) {
            reversedSentence.append(reversedWord).append(" ");
        }

        System.out.println("뒤집힌 문장: " + reversedSentence.toString().trim());
    }
}
