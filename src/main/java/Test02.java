public class Test02 {
    public static void main(String[] args){
        int a,b;
        for(a=2,b=1; a<10; b++){
            System.out.printf("%d * %d = %2d", a, b, a*b);
            if(b==8){
                a++;
                b = 0;
                System.out.println();

            }
        }
    }

    }
