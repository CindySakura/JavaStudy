package test_File;

import java.io.*;

public class FileEncrypt {
    public static void main(String[] args) throws IOException {
        //File f = new File("/home/cindy/java_project/farmerandlord/image/login/background.png"); //
        File f = new File("/home/cindy/java_project/bg.png");
        File dest = new File("/home/cindy/java_project/bgt.png");

        FileInputStream fis = new FileInputStream(f);
        FileOutputStream fos = new FileOutputStream(dest);
        int b;
        while((b = fis.read())!=-1){
            fos.write(b^10);
        }
        fos.close();
        fis.close();
    }
}
