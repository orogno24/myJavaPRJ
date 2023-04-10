public class Training1 {
    public static void main(String[] args) {
        int a,b;
        for(a=2,b=1;a<10;b++){
            System.out.printf("%d * %d = %2d",a, b, a*b);
            if(b==9) {
                b = 0;
                a++;
                System.out.println();
            }
        }
    }
}
