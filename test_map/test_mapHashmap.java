package test_map;

import java.util.*;
import java.util.function.BiConsumer;

public class test_mapHashmap {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        ArrayList<String> Jiangsu = new ArrayList<>();
        Collections.addAll(Jiangsu,"Nanjing","Yangzhou","Suzhou");
        ArrayList<String> Hubei = new ArrayList<>();
        Collections.addAll(Hubei,"Wuhan","Xiaogan","Shiyan");
        ArrayList<String> Hebei = new ArrayList<>();
        Collections.addAll(Hebei,"Shijiangzhuang","Tangshan","Xingtai");

        hm.put("Jiangsu",Jiangsu);
        hm.put("Hubei",Hubei);
        hm.put("Hebei",Hebei);
        Set<String> keys = hm.keySet();
        for (String key : keys) {
            StringBuilder sb = new StringBuilder();
            sb.append(key).append(" = ");
            ArrayList<String> shiList = hm.get(key);
            int size = shiList.size();
            for (int i = 0; i < size; i++) {
                if(i == size-1){
                    sb.append(shiList.get(i));
                }else{
                    sb.append(shiList.get(i)).append(", ");
                }
            }
            System.out.println(sb);
        }
        System.out.println("================");
        Set<Map.Entry<String, ArrayList<String>>> cities = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> city : cities) {
            String key = city.getKey();
            ArrayList<String> value = city.getValue();
            StringJoiner sj = new StringJoiner(", ","","");
            for (String s : value) {
                sj.add(s);
            }
            System.out.println(key + " = "+sj);
        }


    }
}
