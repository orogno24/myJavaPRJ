package ZanDi06;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ZanDi0614 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        System.out.print("input : ");
        for(int i = 0; i < 5; i++){
            int num = s.nextInt();
            set.add(num);
        }

        System.out.print("output : ");
        for(int num : set){
            System.out.print(num + " ");

        }
    }
}
