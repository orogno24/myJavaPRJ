public class Training1 {
    public static void main(String[] args) {
        int a, b;
        for (a = 1, b = 1; b < 6; a++) {
            System.out.print("*");
            if(a>=b){
                a = 0;
                b++;
                System.out.println();
            }
        }
    }
}
