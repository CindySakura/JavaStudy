package test8;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        //1.create list
        ArrayList<String> list = new ArrayList<>();

        //2.add elements
        list.add("like?");
        list.add("subscribe?");
        list.add("repost?");

        //3.go through all elements
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() -1){
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i) + ", ");
            }

        }
        System.out.print("]");
    }
}
