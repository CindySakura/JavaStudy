package test_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class test_hashMap {
    public static void main(String[] args) {
        hashMap_student stu1 = new hashMap_student("amy", 18, "a");
        hashMap_student stu2 = new hashMap_student("amy", 18, "b");
        hashMap_student stu3 = new hashMap_student("cindy", 20, "c");

        Map<hashMap_student,String> m = new HashMap<>();

        m.put(stu1,stu1.getHome());
        m.put(stu2,stu2.getHome());
        m.put(stu3,stu3.getHome());

        m.forEach(( hashMap_student,  s) -> System.out.println(hashMap_student.getName()+"="+s));

        System.out.println("--------------------");
        Set<Map.Entry<hashMap_student, String>> entries = m.entrySet();
        entries.forEach(new Consumer<Map.Entry<hashMap_student, String>>() {
            @Override
            public void accept(Map.Entry<hashMap_student, String> hashMap_studentStringEntry) {
                System.out.println(hashMap_studentStringEntry.getKey()+"="+hashMap_studentStringEntry.getValue());
            }
        });

        System.out.println("--------------");
        Set<hashMap_student> students_keys = m.keySet();
        for (hashMap_student students_key : students_keys) {
            String home = m.get(students_key);
            System.out.println(students_key+"="+home);
        }


    }
}
