public class Ex07_05 {
    public static void main(String[] args){
        int hap = 0;
        int i;

        for (i = 1; i <= 100; i++){
            hap += i;

            if(hap >= 1000){
                System.out.println("멈춘 1 번째 : " + i);
                break;
            }
        }
        System.out.printf("1~100의 합에서 최초로 1000이 넘는 위치는? : %d\n",i);
    }
}
