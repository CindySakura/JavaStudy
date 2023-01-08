package test_map;

import java.util.*;
import java.util.function.BiConsumer;

public class hashPoll {
    public static void main(String[] args) {
        String[] places = {"a","b","c","d"};
        ArrayList<String> poll = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int i1 = r.nextInt(places.length);
            poll.add(places[i1]);
        }

        HashMap<String, Integer> hm = new HashMap<>();
        for (String s : poll) {
            if(hm.containsKey(s)){
                hm.put(s, hm.get(s)+1);
            }else{
                hm.put(s,1);
            }
        }

        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            Integer vote = entry.getValue();
            if(vote > max){
                max = vote;
            }
        }

        System.out.println(hm);
        System.out.println(max);

        for (Map.Entry<String, Integer> entry : entries) {
            if(entry.getValue() == max){
                System.out.println(entry.getKey());
            }
        }
    }
}
