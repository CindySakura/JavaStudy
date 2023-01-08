package test_callStu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class call2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<String> boys = new ArrayList<>();
        ArrayList<String> girls = new ArrayList<>();
        Collections.addAll(arr,1,1,1,1,1,1,1,0,0,0);
        Collections.addAll(boys,"a","b","c","d","e");
        Collections.addAll(girls,"f","g","h","i","j","k");

        Random r = new Random();
        int index = r.nextInt(arr.size());
        if(index == 0){
            Collections.shuffle(girls);
            System.out.println(girls.get(0));
        }else{
            Collections.shuffle(boys);
            System.out.println(boys.get(0));
        }
    }
}
