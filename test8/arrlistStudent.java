package test8;

import java.util.ArrayList;
import java.util.Scanner;

public class arrlistStudent {
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();



        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            student s = new student();
            System.out.println("type in the name of the student");
            String name = sc.next();
            System.out.println("type in the age of the student");
            int age = sc.nextInt();
            s.setName(name);
            s.setAge(age);
            list.add(s);
        }


        for (int i = 0; i < list.size(); i++) {
            student stu = list.get(i);
            System.out.println(stu.getName() + ", " + stu.getAge() );
        }
    }

}
