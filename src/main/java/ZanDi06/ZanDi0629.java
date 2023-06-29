package ZanDi06;

public class ZanDi0629 {
    public static void main(String[] args) {
        int x = 13, y = 9, z = 2;

        switch (x ^ y){
            case 1:
            case 2:
                z *= x -= y;
                break;
            case 3:
            case 4:
                x %= y/= z;
                break;
            default:
                x -= y += z;
        }
        System.out.printf("%d", x ^ y);
    }
}
