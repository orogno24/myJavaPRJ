package Zandi07;

class emp {
    String name;
    int age;

    void printMyself() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}
class Select extends emp {
    int korean_score;
    int math_score;

    Select(String name, int age, int kor_score, int mat_score) {
        this.name = name;
        this.age = age;
        korean_score = kor_score;
        math_score = mat_score;
    }

    void printScore() {
        System.out.println("국어 성적 : " + korean_score);
        System.out.println("수학 성적 : " + math_score);
    }
}

public class Zandi0727 {
    public static void main(String[] args) {
        Select s = new Select("홍길동", 16, 100, 90);
        s.printMyself(); // 객체의 정보 출력
        s.printScore();  // 성적 출력
    }
}

