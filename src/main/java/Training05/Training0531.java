package Training05;

import java.util.HashMap;
import java.util.Scanner;

public class Training0531 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        int num = s.nextInt();
        int count = 0;

        HashMap<String, Integer> spr = new HashMap<>();

        for(int i = 0; i < length; i++){
            spr.put(s.next(), 0);
        }
        for(int i = 0; i < num; i++){
            if(spr.containsKey(s.next()))
                count++;
        }
        System.out.println(count);
    }
}
