package studentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class stuMain {
    public static void startStudentSystem() {
        Scanner sc = new Scanner(System.in);
        ArrayList<student> list = new ArrayList<>();

        loop: while(true){
            System.out.println("------welcome to the student system------");
            System.out.println("1. add student");
            System.out.println("2. delete student");
            System.out.println("3. adjust student");
            System.out.println("4. inquire student");
            System.out.println("5. exit");
            System.out.println("please choose one");

            String choice = sc.next();

            switch (choice){
                case "1":
                    //add
                    addStudent(list);
                    break;
                case "2":
                    //delete
                    deleteStudent(list);
                    break;
                case "3":
                    //adjust
                    adjustStudent(list);
                    break;
                case "4":
                    //inqure
                    inquireStudent(list);
                    break;
                case "5":
                    //exit
                    System.out.println("5.");
                    break loop;
                    //System.exit(0);//stop the virtual machine
                default:
                    //add
                    System.out.println("no such choice");
                    break;
            }
        }

    }

    public static void addStudent(ArrayList<student> list){
        Scanner sc = new Scanner(System.in);
        String id;

        while(true){
            System.out.println("please type in your id");
            id = sc.next();
            boolean flag = contains(id,list);
            if(flag){
                System.out.println("student id already exists, type a new one");
            }else{
                break;
            }
        }

        System.out.println("please type in your name");
        String name = sc.next();

        System.out.println("please type in your age");
        int age = sc.nextInt();

        System.out.println("please type in your address");
        String address = sc.next();

        //create student
        student s = new student(id,name,age,address);

        //add student
        list.add(s);

        System.out.println("Sucessed!");
    }
    public static void deleteStudent(ArrayList<student> list){
        System.out.println("type in the student id that you want to delete");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();

        int index = getIndex(id,list);

        if(index>=0){
            list.remove(index);
            System.out.println("Delete successfully");
        }else{
            System.out.println("Failed, no such student");
        }
    }
    public static void adjustStudent(ArrayList<student> list){
        System.out.println("type in the id that you want to update");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();

        int index = getIndex(id,list);

        if(index>=0){
            student s = list.get(index);
            System.out.println("type in the name");
            String name = sc.next();
            s.setName(name);

            System.out.println("type in the age");
            int age = sc.nextInt();
            s.setAge(age);

            System.out.println("type in the address");
            String address = sc.next();
            s.setAddress(address);

            System.out.println("update successfully");
        }else{
            System.out.println("no such student");
        }
    }
    public static void inquireStudent(ArrayList<student> list){
        if(list.size() == 0){
            System.out.println("there is no student info yet.");
            return;
        }

        System.out.println("id\tName\tAge\tAddress");
        for (int i = 0; i < list.size(); i++) {
            student s = list.get(i);
            System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
        }
    }

    public static boolean contains(String id, ArrayList<student> list){
/*        for (int i = 0; i < list.size(); i++) {
            student s = list.get(i);
            if(s.getId().equals(id)){
                return true;
            }
        }
        return false;*/
        return getIndex(id,list)>=0;
    }

    public static int getIndex(String id, ArrayList<student> list){
        for (int i = 0; i < list.size(); i++) {
            student s = list.get(i);
            if(s.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

}
