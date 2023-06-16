import java.util.*;

class Ex03_01 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int num = s.nextInt();
            list.add(num);
        }

        Collections.sort(list, Collections.reverseOrder());

        for (int j : list) {
            System.out.print(j + " ");
        }
    }
}
