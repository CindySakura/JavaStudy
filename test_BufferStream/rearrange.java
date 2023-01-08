package test_BufferStream;

import java.io.*;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class rearrange {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test_BufferStream/csb.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("test_BufferStream/csbc.txt"));
        String line;
        TreeMap<String,String> tm = new TreeMap<>();
        while((line = br.readLine()) != null){
            String[] split = line.split("\\.");
            tm.put(split[0],split[1]);
        }
        System.out.println(tm);
        Set<String> keys = tm.keySet();
        for (String key : keys) {
            bw.write(tm.get(key));
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
