package test_map;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class test_Map {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<>();

        m.put("a","1");
        m.put("b","2");
        m.put("c","3");

        System.out.println(m);

        System.out.println("By keys");
        Set<String> keys = m.keySet();
        for (String key : keys) {
            System.out.println(key+"="+m.get(key));
        }

        Iterator<String> key_iter = keys.iterator();
        while(key_iter.hasNext()){
            String next = key_iter.next();
            System.out.println(next + " = "+m.get(next));
        }

        keys.forEach( s-> System.out.println(s+" = "+m.get(s)));

        System.out.println("-------------");
        System.out.println("By entry");

        Set<Map.Entry<String, String>> entries = m.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }

        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey()+"="+next.getValue());
        }

        entries.forEach(stringStringEntry->
                System.out.println(stringStringEntry.getKey() +"="+stringStringEntry.getValue())
        );

        System.out.println("-----------------");
        System.out.println("By map");

        m.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+"="+value);
            }
        });

    }
}
