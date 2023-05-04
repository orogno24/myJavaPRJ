package Training05;

import java.util.*;

public class Training0503 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            set.add(s.nextInt());
        }

        System.out.print(set);

    }
}
