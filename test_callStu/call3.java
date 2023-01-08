package test_callStu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class call3 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        Collections.addAll(arr,"a","b","c","d","e","f","g","h","i");

        ArrayList<String> called = new ArrayList<>();

        Random r = new Random();
        int size = arr.size();

        for (int j = 0; j < 5; j++) {
            System.out.println("========= "+j+" turns ===========");
            for (int i = 0; i < size; i++) {
                int index = r.nextInt(arr.size());

        /*String name = arr.get(i);
        arr.remove(i);*/
                String name = arr.remove(index);
                called.add(name);

                System.out.println(name);

                if(arr.size() == 0){
                    arr.addAll(called);
                    called.clear();
                }
            }
        }

    }
}
