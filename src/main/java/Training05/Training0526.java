package Training05;

import java.util.Scanner;


class Cube{
    private int x, y, z;

    Cube(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getx(){
        x *= x;
        return this.x;
    }

    public int gety(){
        y *= y * y;
        return this.y;
    }

    public int getz(){
        z *= z * z * z;
        return this.z;
    }
}
public class Training0526 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();
        Cube c = new Cube(x, y, z);
        System.out.print("제곱 : "+c.getx()+", 세제곱 : "+c.gety()+", 네제곱 : "+c.getz());
    }
}
