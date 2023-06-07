package ZanDi06;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ZanDi0607 {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        Scanner s = new Scanner(System.in);

        int temp;

        for(int i = 0; i < 5; i++){
            int num = s.nextInt();
            list.add(num);
        }

        for(int a = 0; a < list.size(); a++){
            for(int b = a + 1; b < list.size(); b++){
                if(list.get(b) > list.get(a)){
                    temp = list.get(a);
                    list.set(a, list.get(b));
                    list.set(b, temp);
                }
            }
        }

        for(int j : list){
            System.out.print(j + " ");
        }
    }
}
