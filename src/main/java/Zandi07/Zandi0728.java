package Zandi07;

class Loca{
    int wheelDrive;

    public Loca(int wheelDrive){
        this.wheelDrive = wheelDrive;
    }

    void drive(){
        System.out.println("기름을 써서 출발, 구동은? = " + this.wheelDrive);
    }

}

class NtLoca extends Loca{
    int chargeEV;
    public NtLoca(int wheelDrive, int chargeEV){
        super(wheelDrive);
        this.chargeEV = chargeEV;
    }
    @Override
    void drive(){
        System.out.println("전기를 써거 출발, " + "전기충전량= " + this.chargeEV + ", 구동은?= " + this.wheelDrive);
    }

}
public class Zandi0728 {
    public static void main(String[] args) {

        Loca loca = new Loca(2);
        loca.drive();

        NtLoca ntloca = new NtLoca(4, 300);
        ntloca.drive();
    }
}
