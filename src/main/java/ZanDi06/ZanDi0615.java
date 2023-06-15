package ZanDi06;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ZanDi0615 {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        Scanner s = new Scanner(System.in);
        System.out.print("숫자를 5개 입력하시오 : ");

        for(int i = 0; i < 5; i++){
            int num = s.nextInt();
            list.add(num);
        }

        System.out.println("ASC 입력 -> 오름차순, DESC 입력 -> 내림차순");
        s.nextLine();
        String order = s.nextLine();

        switch (order){
            case "ASC" :
                Collections.sort(list);
                break;
            case "DESC" :
                Collections.sort(list, Collections.reverseOrder());
                break;
        }

        for(int num : list){
            System.out.println("+" + num);
        }
    }
}

