package test_throw;

import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GF gf = new GF();

        //
        while(true){
            try{
                System.out.println("plz input your name: ");
                String name = sc.nextLine();
                gf.setName(name);
                System.out.println("plz input your age: ");
                String age = sc.nextLine();
                gf.setAge(Integer.parseInt(age));
                break;
            }catch(NumberFormatException e){
                e.printStackTrace();
            }catch(NameFormatException e){
                e.printStackTrace();
            }catch(AgeOutofBoundsException e){
                e.printStackTrace();
            }
        }
        System.out.println(gf);

        /*int len = name.length();

        while(len<3 || len > 10){
            System.out.println("plz input your name again: ");
            name = sc.nextLine();
            len = name.length();
        }
        gf.setName(name);
        System.out.println("plz input your age");
        String ages = sc.nextLine();
        int age;

        try {
            age = Integer.parseInt(ages);
            while (age< 18 || age > 40) {
                System.out.println("plz input your age again: ");
                ages = sc.nextLine();
                age = Integer.parseInt(ages);
            }
            gf.setAge(age);
        } catch (NumberFormatException e) {
            System.out.println("plz input figures");
        }
        System.out.println(gf);*/
    }
}
