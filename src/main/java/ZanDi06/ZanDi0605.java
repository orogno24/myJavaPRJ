package ZanDi06;

import java.util.*;

public class ZanDi0605 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> list = new LinkedList<>();

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

        for(int num : list){
            System.out.print(num + " ");
        }
    }
}
