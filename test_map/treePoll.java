package test_map;

import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.function.Consumer;

public class treePoll {
    public static void main(String[] args) {
        String text = "abcdeabcdabcaba";

        TreeMap<Character,Integer> tm = new TreeMap<>();

        for (int i = 0; i < text.length(); i++) {
            char t = text.charAt(i);

            if(tm.containsKey(t)){
                tm.put(t,tm.get(t) + 1);
            }else{
                tm.put(t,1);
            }
        }

        StringBuilder sb = new StringBuilder();
        Set<Map.Entry<Character, Integer>> entries = tm.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            sb.append(entry.getKey()).append("(").append(entry.getValue()).append(") ");
        }
        System.out.println(sb);

        System.out.println("----------");
        System.out.println("By string joiner");
        StringJoiner sj = new StringJoiner("","","");
        entries.forEach(entry-> sj.add(entry.getKey()+"("+entry.getValue()+") "));

        System.out.println(sj);



    }
}
