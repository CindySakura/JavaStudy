package test_IOCrawler2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class caller2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("RollCall/src/test_IOCrawler/name.txt"));
        String name;
        ArrayList<String> boys = new ArrayList<>();
        ArrayList<String> girls = new ArrayList<>();
        while((name = br.readLine()) != null){
            String[] detail = name.split("-");
            if(detail[1].equals("F")){
                girls.add(detail[0]);
            }else{
                boys.add(detail[0]);
            }

        }
        br.close();
        //weighted list
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);

        int count = 100;
        int girlcount = 0;
        int boycount = 0;
        ArrayList<String> res = new ArrayList<>();
        Random r = new Random();
        for (int i = 1; i <= count; i++) {
            int x = r.nextInt(list.size());//list.size()
            if(list.get(x) == 1){
                Collections.shuffle(boys);
                res.add(boys.get(0));
                boycount ++;
            }else{
                Collections.shuffle(girls);
                res.add(girls.get(0));
                girlcount ++;
            }
        }
        System.out.println(res);
        System.out.println("the number of boys: "+ boycount);
        System.out.println("the number of girls: "+ girlcount);
    }
}
