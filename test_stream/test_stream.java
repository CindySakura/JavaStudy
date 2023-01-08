package test_stream;

import java.util.*;
import java.util.stream.Stream;

public class test_stream {
    public static void main(String[] args) {
        //collections
        ArrayList<Integer> al = new ArrayList<>();
        Collections.addAll(al,1,2,3);
        al.stream().forEach(s-> System.out.println(s));
        System.out.println("===============");

        //map
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("a",1);
        hm.put("b",2);
        hm.put("c",3);
        hm.put("d",4);
        hm.entrySet().stream().forEach(s-> System.out.println(s));
        System.out.println("================");

        //array
        int[] arr = {1,2,3,4,5};
        Arrays.stream(arr).forEach(s-> System.out.print(s + " "));
        System.out.println("");
        System.out.println("==============");

        //random data
        Stream.of(1,2,3,4,5).forEach(s-> System.out.print(s));
    }
}
