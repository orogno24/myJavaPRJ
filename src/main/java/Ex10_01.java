public class Ex10_01 {
    public static void main(String[] args) {
        int[] aa = new int[3];
        try {
            aa[2] = 100 / 0;
            aa[3] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 첨자가 배열 크기보다 커요 ~~");
            System.out.println("오류 메시지 : " + e);
        } catch (ArithmeticException e) {
            System.out.println("0으로는 나눌 수 없습니다");
            System.out.println("오류 메시지 : " + e);
        } catch (Exception e) {
            System.out.println("자바에서 발생하는 모든 에러 검출"); //catch를 쓸때 제일 밑에 써야함
            System.out.println("오류 메시지 : " + e);
        } finally {
            System.out.println("정상으로 작동하던지 오류가 나던지 무조건 실행합니다");
        }
    }
}

