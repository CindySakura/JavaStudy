package test9;

import java.util.ArrayList;

public class checkExistence {
    public static void main(String[] args) {
        ArrayList<user> list = new ArrayList<>();

        user u1 = new user("1","amy","123");
        user u2 = new user("2","bob","123");
        user u3 = new user("3","cindy","123");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        boolean flag = contains("5",list);

        System.out.println(flag);
    }

    public static boolean contains(String id,ArrayList<user> list){
        for (int i = 0; i < list.size(); i++) {
            user uex = list.get(i);
            if(uex.getId().equals(id)){
                return true;
            }
        }
        return false;
    }
}
