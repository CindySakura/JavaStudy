package test_IOCrawler4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class caller4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("RollCall/src/test_IOCrawler4/name.txt"));
        String name;
        ArrayList<String> names = new ArrayList<>();
        while((name = br.readLine()) != null){
            names.add(name.split("-")[0]);
        }
        br.close();


        BufferedReader br1 = new BufferedReader(new FileReader("RollCall/src/test_IOCrawler4/stu.txt"));
        String called;
        ArrayList<String> calledStu = new ArrayList<>();
        while((called = br1.readLine()) != null){
            calledStu.add(called);
        }
        br1.close();
        String stu;
        int calledStusize = calledStu.size();
        while (true) {
            Collections.shuffle(names);
            stu = names.get(0);
            if(!calledStu.contains(stu)){
                calledStu.add(stu);
                break;
            } else if (calledStusize >= names.size()) {
                break;
            }
        }
        System.out.println(calledStusize);
        if (names.size() > calledStusize) {
            BufferedWriter bw = new BufferedWriter(new FileWriter("RollCall/src/test_IOCrawler4/stu.txt",true));
            bw.write(stu);
            bw.newLine();
            bw.close();
        } else {
            BufferedWriter bw = new BufferedWriter(new FileWriter("RollCall/src/test_IOCrawler4/stu.txt"));
            bw.write(stu);
            bw.newLine();
            bw.close();
        }

    }
}
