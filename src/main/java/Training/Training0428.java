package Training;

import java.util.ArrayList;
import java.util.List;

public class Training0428 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("이협건");
        list.add("홀길동");
        list.add("임꺽정");
        list.add("고길동");


        int listSize = list.size();

        System.out.println("저장된 데이터 수 : " + listSize);

        //3세대
        list.forEach(name -> System.out.println("name : " + name));
        //4세대
        list.parallelStream().forEach(name -> System.out.println("name : " + name));

    }
}
