package test_File;

import java.io.File;
import java.io.IOException;

public class FileDelete {
    public static void main(String[] args) throws IOException {
        /*File f0 = new File("forDelete/d1/d2/d3");
        f0.mkdirs();
        File f1 = new File("forDelete/d1/b.txt");
        f1.createNewFile();
        File f2 = new File("forDelete/d1/d2/c.txt");
        f2.createNewFile();*/
        File f = new File("forDelete");
        deleteDir(f);
    }


    public static void deleteDir(File file){
        File[] files = file.listFiles();
        if(files == null){
            if(file.isFile()){
                file.delete();
                System.out.println(file.getAbsoluteFile()+" deleted.");
                return;
            }
            System.out.println("wrong dir");
            return;
        }
        for (File subfile : files) {
            deleteDir(subfile);
            //System.out.println(subfile+" 666"); why here subfile is not null, it has already been deleted.
            if(subfile.isDirectory()){ //&&  && subfile.listFiles().length == 0
                System.out.println(subfile.getAbsoluteFile() + " deleted");
                subfile.delete();
            }

        }
        System.out.println("length == 0");



    }
}
