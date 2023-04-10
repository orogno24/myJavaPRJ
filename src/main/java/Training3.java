import java.util.Scanner;

public class Training3 {
    public static void main(String[] args) {

        double answer = 0;
        int a,b,c;
        Scanner s = new Scanner(System.in);

        System.out.printf("배열 길이 설정 : ");
        a = s.nextInt();

        int[] aa = new int[a];
        for(b = 0;a<b;b++){
            aa[b] = s.nextInt();
            System.out.printf("배열 원소의 평균값 : %d", aa[b]);
        }
    }
}