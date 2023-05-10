package Training05;


class K {

    private int num;
    private String str;

    K(int num, String str) {
        this.num = num;
        this.str = str;
    }

    public int num(){
        return num;
    }

    public String str(){
        return str;
    }

}

public class Training0510 {

    public static void main(String[] args) {

        K k1 = new K(50, "k1");
        K k2 = new K(300, "k2");

        System.out.println(k1.num() + " " + k1.str());
        System.out.println(k2.num() + " " + k2.str());
    }
}
