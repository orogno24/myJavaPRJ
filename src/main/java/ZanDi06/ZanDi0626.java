package ZanDi06;

public class ZanDi0626 {

    public static int add(int a, int b){
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a, int b, int c){
        return a+b+c;
    }


    public static void main(String[] args) {
        int x = 1, y = 2, z = 3;
        double x2 = 1, y2 = 2;

        System.out.println(add(x,y));
        System.out.println(add(x2,y2));
        System.out.println(add(x,y,z));
    }

}
