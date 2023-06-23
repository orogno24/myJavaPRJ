package ZanDi06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ZanDi0623 {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();

        num.add(5);
        num.add(3);
        num.add(6);
        num.add(1);
        num.add(2);
        num.add(4);

        Collections.sort(num);

        num.forEach(n -> System.out.print(n + " "));
    }
}
