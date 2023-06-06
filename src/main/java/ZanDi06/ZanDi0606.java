package ZanDi06;

import java.util.Scanner;

public class ZanDi0606 {

    static class SQLD{
        private String x, y, z;

        SQLD(String x, String y, String z){
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public String getx(String a){
            if (x.equals("S")) {
                x = "SELECT";
            }
            return this.x;
        }

        public String gety(String b){
            if (y.equals("*")) {
                y = "*";
            }
            return this.y;
        }

        public String getz(String c){
            if (z.equals("E")) {
                z = "FROM EMP;";
            }
            return this.z;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        String c = s.nextLine();

        SQLD sq = new SQLD(a, b, c);

        System.out.print(sq.getx(a) + sq.gety(b) + sq.getz(c));

    }
}
