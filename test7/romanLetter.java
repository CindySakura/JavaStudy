package test7;

import java.util.Scanner;

public class romanLetter {
    public static void main(String[] args) {
        //type in roman letters
        Scanner sc = new Scanner(System.in);
        System.out.println("type in a num");
        String romannum;

        //check if it meets the requirements
        while(true){
            romannum = sc.next();
            boolean flag = checkStr(romannum);

            if(flag) {
                break;
            }else{
                System.out.println("wrong number,type in again");
                continue;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < romannum.length(); i++) {
            char c = romannum.charAt(i);
            int num = c-48;
            String s = changeRoman(num);
            sb.append(s);
        }
        System.out.println(sb);
    }

     public static boolean checkStr(String str){
        if (str.length() > 9){
            return false;
        }
         for (int i = 0; i < str.length(); i++) {
             char c = str.charAt(i);
             if(c <'0' ||c>'9'){
                 return false;
             }
         }
         return true;
     }

     public static String changeRoman(int num){
        String[] arr = {"","one","two","three", "four",
                "five","six","seven","eight","nine", "ten"};
        return arr[num];
     }

}
