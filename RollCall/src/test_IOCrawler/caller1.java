package test_IOCrawler;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class caller1 {
    public static void main(String[] args) throws IOException {
        //read name and count files, shuffle names
        BufferedReader br = new BufferedReader(new FileReader("RollCall/src/test_IOCrawler/name.txt"));
        String name;
        ArrayList<String> names = new ArrayList<>();
        while((name = br.readLine()) != null){
            names.add(name);
        }
        br.close();

        Collections.shuffle(names);
        String nameStr = names.get(0).split("-")[0];
        System.out.println(nameStr);

    }
}
