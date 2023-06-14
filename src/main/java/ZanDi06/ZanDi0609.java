package ZanDi06;

import java.util.Scanner;



    class ZanDi{
        private int a, b, c;
        ZanDi(int a, int b, int c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        int qwe(){
            a *= a * a;
            return this.a;
        }
        int rty(){
            int hap = 0;

            for(int i = 1; i <= b; i++){
                hap += i;
            }

            b = hap;

            return this.b;
        }
        int uio(){
            int gob = 1;

            for(int i = 1; i <= c; i++){
                gob *= i;
            }

            c = gob;

            return this.c;
        }

    }

public class ZanDi0609 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();

        ZanDi zan = new ZanDi(x,y,z);

        System.out.print("세제곱 : " + zan.qwe() + " 1부터까지의 합 : "  + zan.rty() + " 1부터까지의 곱 : "  + zan.uio());


    }
}