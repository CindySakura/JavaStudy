package test_map;

import java.util.Comparator;
import java.util.TreeMap;

public class test_treeMap2 {
    public static void main(String[] args) {
        TreeMap<treeMap_student,String> tm = new TreeMap<>();

        treeMap_student s1 = new treeMap_student("amy",12);
        treeMap_student s2 = new treeMap_student("amy",12);
        treeMap_student s3 = new treeMap_student("cindy",14);

        tm.put(s2,"b");
        tm.put(s3,"c");
        tm.put(s1,"a");

        System.out.println(tm);

    }
}
