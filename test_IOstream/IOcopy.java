package test_IOstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOcopy {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("/home/cindy/java_project/puzzleGame/image/about.png");
        FileOutputStream fos = new FileOutputStream("test_IOstream/about.png");

        int b;
        while((b = fis.read()) != -1){
            fos.write(b);
        }

        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println(end-start);

        System.out.println("=============");
        long startM = System.currentTimeMillis();
        FileInputStream fisM = new FileInputStream("/home/cindy/java_project/puzzleGame/image/about.png");
        FileOutputStream fosM = new FileOutputStream("test_IOstream/aboutM.png");

        int bM;
        byte[] bytes = new byte[1024*5];
        while((bM = fisM.read(bytes)) != -1){
            fosM.write(bytes,0,bM);
        }

        fosM.close();
        fisM.close();
        long endM = System.currentTimeMillis();
        System.out.println(endM-startM);

    }
}
