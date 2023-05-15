package Training05;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Training0509_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> list = new LinkedList<>();

        for(int a = 0; a < 5; a++){
            int num = s.nextInt();
            list.add(num);
        }

        for(int b = 0; b < list.size(); b++){
            for(int c = b + 1; c < list.size(); c++){
                if(Objects.equals(list.get(b), list.get(c))){
                    list.remove(c);
                    c--;
                }
            }
        }

        for(int num : list) {
            System.out.print(num + " ");
        }
    }
}