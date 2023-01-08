package test_stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class test_stream1 {
    public static void main(String[] args) {
        System.out.println("exercise 1:");
        ArrayList<Integer> arr =  new ArrayList<>();
        Collections.addAll(arr,1,2,3,4,5,6,7,8,9,10);
        List<Integer> res1 = arr.stream().filter(s -> (s % 2) == 0).collect(Collectors.toList());
        System.out.println(res1);

        System.out.println("exercise 2:");
        ArrayList<String> arr2 =  new ArrayList<>();
        Collections.addAll(arr2,"a, 1", "b, 2","c, 3");
        Map<String, Integer> res2 = arr2.stream().filter(s -> Integer.parseInt(s.split(", ")[1]) >= 2)
                .collect(Collectors.toMap(n -> n.split(", ")[0], n -> Integer.parseInt(n.split(", ")[1])));
        System.out.println(res2);
    }
}
