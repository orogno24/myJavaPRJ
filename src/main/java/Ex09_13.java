public class Ex09_13 {

    static int plus(int v1, int v2 ,int v3) {
        int result;
        result = v1 + v2 + v3;
        return result;
    }

    public static void main(String[] args) {
        int hap;
        hap = plus(100,200,300);
        System.out.printf("100과 200의 plus()메소드 결과는 : %d\n", hap);
    }
}
