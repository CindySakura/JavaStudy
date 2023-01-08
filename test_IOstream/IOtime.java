package test_IOstream;

import java.io.*;

public class IOtime {
    public static void main(String[] args) throws IOException {
        //basic stream: 1 byte at a time
        long start1 = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("test_IOstream/about.png");
        FileOutputStream fos = new FileOutputStream("test_IOstream/aboutD.png");

        int num;
        while ((num = fis.read()) != -1){
            fos.write(num);
        }
        fos.close();
        fis.close();
        long end1 = System.currentTimeMillis();
        System.out.println(end1-start1);

        //basic stream: more bytes at a time
        long start2 = System.currentTimeMillis();
        FileInputStream fis2 = new FileInputStream("test_IOstream/about.png");
        FileOutputStream fos2 = new FileOutputStream("test_IOstream/aboutA.png");

        int len;
        byte[] bytes = new byte[1024];
        while ((len = fis2.read(bytes)) != -1){
            fos2.write(bytes,0,len);
        }
        fos2.close();
        fis2.close();
        long end2 = System.currentTimeMillis();
        System.out.println(end2-start2);

        //buffer stream: one byte at a time
        long start3 = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("test_IOstream/about.png"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("test_IOstream/aboutB.png"));

        int num2;
        while((num2=bis.read())!=-1){
            bos.write(num2);
        }
        bos.close();
        bis.close();
        long end3 = System.currentTimeMillis();
        System.out.println(end3-start3);

        //buffer stream: one byte at a time
        long start4 = System.currentTimeMillis();
        BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream("test_IOstream/about.png"));
        BufferedOutputStream bos2 = new BufferedOutputStream(new FileOutputStream("test_IOstream/aboutC.png"));

        int len2;
        byte[] bytes2 = new byte[1024];
        while((len2=bis2.read(bytes2))!=-1){
            bos2.write(bytes2,0,len2);
        }
        bos2.close();
        bis2.close();
        long end4 = System.currentTimeMillis();
        System.out.println(end4-start4);
    }
}
