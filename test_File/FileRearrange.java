package test_File;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class FileRearrange {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/home/cindy/java_project/a.txt");
        FileWriter fw = new FileWriter("/home/cindy/java_project/b.txt");
        int ch;
        StringBuilder sb = new StringBuilder();
        while((ch = fr.read())!= -1){
            sb.append((char)ch);
        }
        String[] s = sb.toString().split("-");
        Integer[] integers = Arrays.stream(s).map(String::trim).map(Integer::parseInt).sorted().toArray(Integer[]::new);
        System.out.println(Arrays.toString(integers));
        /*for (int i = 0; i < integers.length; i++) {
            if(i == integers.length -1){
                fw.write(integers[i]+"");
            }else{
                fw.write(integers[i] + "-");
            }
        }*/
        String replace = Arrays.toString(integers).replace(", ", "-");
        System.out.println(replace);
        fw.write(replace,1,replace.length()-2);

        fw.close();
        fr.close();

    }
}
