import java.util.*;

public class CollectionOf {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("이협건");
        set.add("홍길동");
        set.add("고길동");
        set.add("임꺽정");
        set.add("둘리");

        List<String> list = new ArrayList<>();
        list.add("이협건");
        list.add("홍길동");
        list.add("고길동");
        list.add("임꺽정");
        list.add("둘리");

        Map<String, String> map = new HashMap<>();
        map.put("이", "협건");
        map.put("홍", "길동");
        map.put("고", "길동");
        map.put("임", "꺽정");
        map.put("둘", "리");

        System.out.println("set : " + set);
        System.out.println("set : " + list);
        System.out.println("set : " + map);

    }
}
