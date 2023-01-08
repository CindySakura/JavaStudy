package test_File;

import java.io.File;
import java.util.Arrays;

public class FileSearch {
    public static void main(String[] args) {
        /*File f1 = new File("test_File");
        File[] files = f1.listFiles();
        for (File file : files) {
            isTXT(file);
        }*/

        File f2 = new File("/home/cindy/Downloads/day2-资料-阶段项目（综合练习&斗地主游戏）");
        searchAllTxtUnderDir(f2);


    }

    public static boolean isTXT(File file){
        if(file.getName().endsWith(".md")){
            System.out.println(file);
            return true;
        }
        return false;
    }

    public static void searchAllTxtUnderDir(File file){
        File[] files = file.listFiles();
        if(files == null){
            isTXT(file);
            return;
        }
        for (File subfile : files) {
            boolean istxt = isTXT(subfile);
            if(!istxt){
                searchAllTxtUnderDir(subfile);
            }
        }

    }
}
