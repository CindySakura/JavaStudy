package test7;

import java.util.Scanner;

public class romanLetter2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type in a number");
        String number;

        while(true){
            number = sc.next();
            boolean flag = checknum(number);
            if(flag){
                break;
            }else{
                System.out.println("wrong number, type in again");
                continue;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            String s = changeRoman(c);
            sb.append(s);
        }

        System.out.println(sb);
    }

    public static boolean checknum(String str){
        if(str.length()>9){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c<'0'||c>'9'){
                return false;
            }
        }
        return true;
    }

    public static String changeRoman(char number){
        String str;
        switch(number){
            case '0':
                str = "";
                break;
            case '1':
                str = "one";
                break;
            case '2':
                str = "two";
                break;
            case '3':
                str = "three";
                break;
            case '4':
                str = "four";
                break;
            case '5':
                str = "five";
                break;
            case '6':
                str = "six";
                break;
            case '7':
                str = "seven";
                break;
            case '8':
                str = "eight";
                break;
            case '9':
                str = "nine";
                break;
            default:
                str = "";
        }
        return str;
    }
}
