package Zandi07;

abstract class Shape {
    protected String type;

    public Shape(String type) {
        this.type = type;
    }
    public abstract void draw();
}

class Rectangle extends Shape {
    String name;
    private int width;
    private int height;
    public Rectangle(String type, String name, int width, int height) {
        super(type);
        this.name = name;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
    }
}

public class Zandi0731 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("rectangle", "blue", 10, 5);
        System.out.println(rectangle.name);
        System.out.println(rectangle.type);
    }
}