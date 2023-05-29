package Training05;

import java.util.Scanner;

public class Training0529 {
    public static void main(String[] args) {
        System.out.println("Quiz) EMP02 테이블의 이름을 EMP09로 변경하는 SQL을 대문자로 작성하시오 : ");

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String[] expectedWords = {"RENAME", "EMP02", "TO", "EMP09;"}; // 예상되는 정확한 단어들

        String[] words = s.split(" "); // 입력된 문장을 띄어쓰기로 분할하여 단어들로 저장

        boolean Error = false;

        for (int i = 0; i < expectedWords.length; i++) {
            if (!expectedWords[i].equals(words[i])) {
                Error = true;
                break;
            }
        }

        if (Error) {
            System.out.println("단어를 정확하게 입력해주세요.");
        } else {
            System.out.println("입력이 정확합니다.");
        }
    }
}
