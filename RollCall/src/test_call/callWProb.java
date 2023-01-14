package test_call;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class callWProb {
    public static void main(String[] args) throws IOException {
        //read student info
        BufferedReader br = new BufferedReader(new FileReader("RollCall/src/test_call/name.txt"));
        ArrayList<Student> stu = new ArrayList<>();
        String line;
        while((line = br.readLine())!=null){
            String[] s = line.split("-");
            stu.add(new Student(s[0],s[1],Integer.parseInt(s[2]),Double.parseDouble(s[3])));
        }
        br.close();

        //calculate the total weight
        double[] weight = new double[stu.size()];
        double all = 0;
        for (int i = 0; i < weight.length; i++) {
            weight[i] = stu.get(i).getProb();
            all += weight[i];
        }

        //calculate the weight of each student
        double[] weightd = new double[stu.size()];
        for (int i = 0; i < weight.length; i++) {
            weightd[i] = weight[i] / all;
        }
        for (int i = 1; i < weight.length; i++) {
            weightd[i] = weightd[i] + weightd[i-1];
        }

        //find index
        double number = Math.random();
        int result = -Arrays.binarySearch(weightd,number)-1;
        stu.get(result).setProb(weight[result]/2);


        BufferedWriter bw = new BufferedWriter(new FileWriter("RollCall/src/test_call/name.txt"));
        for (Student student : stu) {
            bw.write(student.toString());
            bw.newLine();
        }
        bw.close();
    }
}
