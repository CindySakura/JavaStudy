package test_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test_stream2 {
    public static void main(String[] args) {
        ArrayList<String> actor = new ArrayList<>();
        Collections.addAll(actor,"dasjkd, 25","sda, 21", "njs, 34");

        ArrayList<String> actress = new ArrayList<>();
        Collections.addAll(actress,"cfa, 25","cfb, 21", "fc, 34");

        Stream<String> actorlen3 = actor.stream().filter(s -> s.split(", ")[0].length() == 3).limit(2);
        Stream<String> actressc = actress.stream().filter(s -> s.startsWith("c")).skip(1);
        List<Actor> collect = Stream.concat(actorlen3, actressc)
                .map(s -> new Actor(s.split(", ")[0], Integer.parseInt(s.split(", ")[1])))
                .collect(Collectors.toList());

        System.out.println(collect);
    }

}
