package test6;

import java.util.Scanner;

public class idcard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type in your id card number:");
        String id = sc.next();

        String year = id.substring(6,10);
        String month = id.substring(10,12);
        String day = id.substring(12,14);

        char gender = id.charAt(16);
        if(gender % 2 == 0){
            System.out.println("Gender: female");
        }else{
            System.out.println("Gender: 450304199male");
        }





    }
}
