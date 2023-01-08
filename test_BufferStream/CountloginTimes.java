package test_BufferStream;

import java.io.*;

public class CountloginTimes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test_BufferStream/count.txt"));
        String line =  br.readLine();
        int i = Integer.parseInt(line);
        i++;
        if(i < 4){
            System.out.println(i + " times free try");
        }else{
            System.out.println("already used 3 times, please buy premium");
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("test_BufferStream/count.txt"));
        bw.write(i+"");
        bw.close();
        br.close();
    }
}

