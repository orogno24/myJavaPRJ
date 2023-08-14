package Zandi_08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Zandi0814 {
    public static void main(String[] arcs) {
        Map<String, String> ar = new HashMap<String, String>();
        ar.put("key1", "value1");
        ar.put("key2", "value2");
        ar.put("key3", "value3");

        Iterator<String> keys = ar.keySet().iterator();
        while( keys.hasNext() ){
            String key = keys.next();
            String value = ar.get(key);
            System.out.println("키 : "+key+", 값 : "+value);
        }

        for( String key : ar.keySet() ){
            String value = ar.get(key);
            System.out.println( String.format("키 : "+key+", 값 : "+value));
        }

    }
}