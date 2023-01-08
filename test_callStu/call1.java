package test_callStu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class call1 {
    public static void main(String[] args) {
        //Method 1
        ArrayList<String> arr = new ArrayList<>();
        /*arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("d");
        arr.add("e");
        arr.add("f");*/
        Collections.addAll(arr,"a","b","c","d","e","f","g","h");

        Random r  = new Random();
        int index = r.nextInt(arr.size());
        System.out.println(arr.get(index));

        //Method 2
        Collections.shuffle(arr);
        System.out.println(arr.get(0));
    }
}
