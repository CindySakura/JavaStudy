package test_IOCrawler3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class caller3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("RollCall/src/test_IOCrawler/name.txt"));
        String name;
        ArrayList<String> names = new ArrayList<>();
        while((name = br.readLine()) != null){
            names.add(name.split("-")[0]);
        }
        br.close();

        BufferedReader br1 = new BufferedReader(new FileReader("RollCall/src/test_IOCrawler3/count.txt"));
        int count = Integer.parseInt(br1.readLine());
        if(count == 3){
            System.out.println("zhangsan");
        }else{
            Collections.shuffle(names);
            System.out.println(names.get(0));
        }
        br1.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter("RollCall/src/test_IOCrawler3/count.txt"));
        count++;
        bw.write(count+"");
        bw.close();
    }
}
