package test_immutable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class immutable {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(1,"a");
        hm.put(2,"b");
        hm.put(3,"c");
        hm.put(4,"d");
        hm.put(5,"e");
        hm.put(6,"f");
        hm.put(7,"g");
        hm.put(8,"i");
        hm.put(9,"j");
        hm.put(10,"k");
        hm.put(11,"l");

        Map<Object, Object> map = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));

        Set<Map.Entry<Object, Object>> entries = map.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println(entry.getKey()+" = " + entry.getValue());
        }

        System.out.println("==============");

        Map<Integer, String> map2 = Map.copyOf(hm);
        Set<Map.Entry<Integer, String>> entries1 = map2.entrySet();
        for (Map.Entry<Integer, String> entry : entries1) {
            System.out.println(entry.getKey()+" = " + entry.getValue());
        }

        System.out.println("==========");
        List<String> strings = List.of("1", "2");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
