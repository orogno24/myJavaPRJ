public class Pyramid {

    public static void main (String[] args){

        int X=0;
        for(int Y=1;Y<8;Y++) {
            if (Y<5) {X++;}
            else {X--;}
            for (int Z=0;Z<X;Z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
