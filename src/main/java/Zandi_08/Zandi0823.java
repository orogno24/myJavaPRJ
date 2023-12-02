package Zandi_08;

class SuperClass {
    public void check() {
        System.out.println("부모 메소드");
    }

    public void sum(int x, int y) {
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum += i;
        }
        System.out.println("합계 : " + sum);
    }
}

class SubClass extends SuperClass {
    public void check() {
        System.out.println("자식 메소드");
    }

    public void sum(int x, int y) {
        int sum = 0, odd = 0, even = 0;
        for (int i = x; i <= y; i++) {
            sum += i;
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }
        System.out.print("합계 : " + sum);
        System.out.println("(짝수 합 : " + even + " / 홀수 합 : " + odd + ")");
    }
}

public class Zandi0823 {
    public static void main(String[] args) {
        SubClass sub = new SubClass();
        sub.check();
        sub.sum(0, 10);
    }
}
