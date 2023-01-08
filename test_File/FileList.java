package test_File;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FileList {
    public static void main(String[] args) {
        //File f = new File("/home/cindy/java_project/farmerandlord/farmerandlord.iml");
        //File f1 = new File("/home/cindy/java_project/Doudizhu/Doudizhu.iml");
        File f2 = new File("/home/cindy/java_project/puzzleGame");
        HashMap<String,Integer> hm = new HashMap<>();
        //addsuffix(hm, f);
        //addsuffix(hm,f1);
        search(hm, f2);
        System.out.println(hm);
    }

    public static void addsuffix(HashMap<String,Integer> arr, File f){
        String suffix = f.getName().split("\\.")[1];
        if(!arr.containsKey(suffix)){
            arr.put(suffix,1);
        }else{
            arr.replace(suffix,arr.get(suffix) + 1);
        }
    }

    public static void search(HashMap<String,Integer> arr, File f){
        File[] files = f.listFiles();
        if(files == null && f.isFile()){
            addsuffix(arr,f);
            return;
        } else if (files == null) {
            return;
        }

        for (File file : files) {
            if(file.isFile()){
                addsuffix(arr, file);
            } else if (file.isDirectory()) {
                search(arr,file);
            }
        }
    }
}
