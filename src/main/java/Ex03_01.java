import java.util.*;

class Ex03_01 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        for(int a = 0; a < 5; a++){
            int num = s.nextInt();
            list.add(num);
        }

        for(int b = 0; b < list.size(); b++){
            for(int c = b + 1; c < list.size(); c++){
                if(list.get(b) == list.get(c)){
                    list.remove(c);
                    c--;
                }
            }
        }
        for(int num : list){
            System.out.print(num + " ");
        }
    }
}