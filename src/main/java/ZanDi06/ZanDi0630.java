package ZanDi06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ZanDi0630 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        // List 객체에 데이터 추가하기
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        // List 저장된 데이터 수
        int listSize = list.size();

        System.out.println("저장된 데이터 수 : " + listSize);

        System.out.println("1세대 반복문");
        for(int i = 0; i < listSize; i++){
            System.out.println("이름 : " + list.get(i));
        }

        System.out.println("2세대 반복문");
        for(String name : list){
            System.out.println("이름 : " + name);
        }

        System.out.println("3세대 반복문");

        list.forEach(name -> System.out.println("name : " + name));

        System.out.println("4세대 반복문");

        list.parallelStream().forEach(name -> System.out.println("name : " + name));

        System.out.println("1.5세대 반복문");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String name = it.next();
            System.out.println("이름 : " + name);
        }

    }


}
