package test_File;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        File f = new File("/home/cindy/java_project/farmerandlord/example"); // /background.png
        //FileOutputStream fos = new FileOutputStream("/home/cindy/java_project");
        File output = new File("/home/cindy/java_project");
        searchfiles(f, output);
    }

    public static void searchfiles(File f, File output) throws IOException {

        File[] files = f.listFiles();
        if(f.isFile()){
            FileInputStream fis = new FileInputStream(f);
            FileOutputStream fos = new FileOutputStream(output+"/"+f.getName());
            int len;
            byte[] bytes = new byte[1024*5];
            while ((len = fis.read(bytes)) != -1){
                fos.write(bytes,0,len);
            }
            fos.close();
            fis.close();
        }else{
            output = new File(output + "/"+f.getName());
            output.mkdir();
            for (File file : files) {
                searchfiles(file,output);
            }
        }
    }
}
