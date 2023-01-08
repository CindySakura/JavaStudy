package test_map;

import java.util.Comparator;
import java.util.TreeMap;

public class test_treeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm1 = new TreeMap<>();

        tm1.put(3,"c");
        tm1.put(1,"a");
        tm1.put(2,"b");

        System.out.println(tm1);

        TreeMap<Integer, String> tm2 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1 - integer;
            }
        });

        tm2.put(3,"c");
        tm2.put(1,"a");
        tm2.put(2,"b");

        System.out.println(tm2);
    }
}
