package Training05;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Training0509_3 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        int temp;

        for(int a = 0; a < 5; a++){
            int num = s.nextInt();
            list.add(num);
        }

        for(int b = 0; b < list.size(); b++){
            for(int c = b + 1; c < list.size(); c++){
                if(list.get(b) < list.get(c)){
                    temp = list.get(b);
                    list.set(b, list.get(c));
                    list.set(c, temp);
                }
            }
        }

        for(int num : list){
            System.out.print(num + " ");
        }
    }
}
