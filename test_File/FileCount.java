package test_File;

import java.io.File;
import java.util.Arrays;

public class FileCount {
    public static void main(String[] args) {
        File f = new File("/home/cindy/java_project/puzzleGame");
        //File f = new File("test_File");
        System.out.println(countFile(f)/1024/1024.0);///1024
    }
    public static long countFile(File f){
        long sumF = 0;
        File[] files = f.listFiles();
        for (File file : files) {
            if(file.isFile()){
                sumF += file.length();
            }else{
                sumF += countFile(file);
            }
        }
        return sumF;
    }
}
