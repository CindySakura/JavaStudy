package test_IOstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOcopymultiple {
    public static void main(String[] args) throws IOException {
        /*File f = new File("test_IOstream/a.txt");
        f.createNewFile();*/
        FileInputStream fis = new FileInputStream("test_IOstream/a.txt");
        FileOutputStream fos = new FileOutputStream("test_IOstream/b.txt");

        byte[] bytes = new byte[2];

        int read1 = fis.read(bytes);
        System.out.println(read1);
        String s = new String(bytes,0,read1);
        System.out.println(s);

        int read2 = fis.read(bytes);
        System.out.println(read2);
        String s2 = new String(bytes,0,read2);
        System.out.println(s2);

        int read3 = fis.read(bytes);
        System.out.println(read3);
        String s3 = new String(bytes,0,read3);
        System.out.println(s3);

        fos.close();
        fis.close();
    }
}
