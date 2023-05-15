package Training05;

import java.util.Scanner;

public class Training0509 {

    public static int abc(int a){

        switch(a){
            case 1:
                System.out.print("가위"); break;
            case 2:
                System.out.print("바위"); break;
            case 3:
                System.out.print("보"); break;
            default:
                System.out.print("???");
        }

        return 0;
    }


    public static void main(String[] args) {
        {
            int x;
            Scanner s = new Scanner(System.in);

            x = s.nextInt();
            x = abc(x);

        }
    }
}
