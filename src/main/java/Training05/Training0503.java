package Training05;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Training0503 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> list = new LinkedList<>();
        System.out.print("입력 값 : ");
        for(int i = 0; i < 5; i++){
            int num = s.nextInt();
            list.add(num);
        }

        for(int i = 0; i < list.size(); i++){
            for(int k = i + 1; k < list.size(); k++){
                if(Objects.equals(list.get(i), list.get(k))){
                    list.remove(k);
                    k--;
                }
            }
        }
        System.out.print("저장된 값은 ");
        for(int num: list) {
            System.out.print(num + " ");
        }
        System.out.print("입니다.");
    }
}
