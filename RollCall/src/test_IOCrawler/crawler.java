package test_IOCrawler;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class crawler {
    public static void main(String[] args) throws IOException {
        //website url
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?from=kg1&highlight=&pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&srcid=51369";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String gilrNameNet = "http://www.haoming8.cn/baobao/7641.html";
        //get all information from website
        String familyNameStr = webCrawler(familyNameNet);
        String boyNameStr = webCrawler(boyNameNet);
        String gilrNameStr = webCrawler(gilrNameNet);
        //get only useful information
        ArrayList<String> familyTmpName = getData(familyNameStr, "(.{4})(，|。)", 1);
        ArrayList<String> boyTmpName = getData(boyNameStr, "([\\u4E00-\\u9FA5]{2})(、|。)", 1);
        ArrayList<String> girlTmpName = getData(gilrNameStr, "(.. ){4}..", 0);
        //deal with obtained information
        ArrayList<String> familyName = new ArrayList<>();
        for (String s : familyTmpName) {
            for (int i = 0; i < s.length(); i++) {
                familyName.add(s.charAt(i) + "");
            }
        }
        ArrayList<String> boyName = new ArrayList<>();
        for (String name : boyTmpName) {
            if(!boyName.contains(name)){
                boyName.add(name);
            }
        }

        ArrayList<String> girlName = new ArrayList<>();
        for (String s : girlTmpName) {
            String[] names = s.split(" ");
            Collections.addAll(girlName,names);
        }
        //generate fake names
        ArrayList<String> list = generateNames(familyName, boyName, girlName, 20, 20);
        BufferedWriter bw = new BufferedWriter(new FileWriter("RollCall/src/test_IOCrawler/name.txt"));
        for (String name : list) {
            bw.write(name);
            bw.newLine();
        }
        bw.close();

    }

    private static ArrayList<String> generateNames(ArrayList<String> familyName, ArrayList<String> boyName,ArrayList<String> girlName, int boynum, int girlnum) {
        //generate boys' names
        HashSet<String> boys = new HashSet<>();
        while(true){
            if(boys.size() == boynum){
                break;
            }
            Collections.shuffle(familyName);
            Collections.shuffle(boyName);
            boys.add(familyName.get(0) + boyName.get(0));
        }
        //generate girls' names
        HashSet<String> girls = new HashSet<>();
        while(true){
            if(girls.size() == girlnum){
                break;
            }
            Collections.shuffle(familyName);
            Collections.shuffle(girlName);
            girls.add(familyName.get(0) + girlName.get(0));
        }

        ArrayList<String> result= new ArrayList<>();
        Random r = new Random();
        for (String boy : boys) {
            result.add(boy + "-M-" + (r.nextInt(10) + 18));
        }

        for (String girl : girls) {
            result.add(girl + "-F-" + (r.nextInt(5) + 18));
        }
        Collections.shuffle(result);
        return result;
    }

    private static ArrayList<String> getData(String nameStr, String regex, int index) {
        ArrayList<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(nameStr);
        while(matcher.find()){
            String group = matcher.group(index); //catch the group of regex: 0 is catch all, 1 is the first group, 2 is the second group
            list.add(group);
        }

        return list;
    }

    private static String webCrawler(String website) throws IOException {
        URL web = new URL(website);
        URLConnection conn = web.openConnection();
        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        //put everything we crawled into stringbuilder
        StringBuilder sb = new StringBuilder();
        int b;
        while((b = isr.read()) != -1){
            sb.append((char)b);
        }
        isr.close();
        return sb.toString();
    }
}
