package Zandi07;

class SuperObject {
    public void paint(){
        draw();
    }

    public void draw(){
        draw();
        System.out.println("Super Object!");
    }
}

class SuperObject3 extends SuperObject {
    public void paint(){
        super.draw();
    }

    public void draw(){
        System.out.println("Super Object3!");
    }
}
public class Zandi0705 {
    public static void main(String[] args) {
        SuperObject a = new SuperObject3();
        a.paint();
    }
}
