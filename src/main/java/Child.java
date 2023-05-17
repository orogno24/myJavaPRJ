public class Child extends Car2  {

    private String child;

    Child(String color, int speed) {
        super(color, speed);
    }

    @Override
    public String getColor() {
        return child;
    }

}
