import java.util.Scanner;
public class Quiz3 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int num;

        System.out.printf("입력 값 : ");
        num = s.nextInt();

        if(num%2==0&&num%3==0){
            System.out.printf("2의 배수와 3의 배수 만족");
        }
        else if(num%2==0){
            System.out.printf("2의 배수 만족");
        }
        else if(num%3==0){
            System.out.printf("3의 배수 만족");
        }
    }
}
