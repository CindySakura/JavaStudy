package test_parseInt;

import java.util.Scanner;
import java.util.regex.Pattern;

public class parseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number:");
        String s = sc.nextLine();
        int p_int = parseint(s);
    }

    public static int parseint(String s){
        if(!s.matches("[1-9]\\d{0,9}")){
            System.out.println("wrong input");
            return 0;
        }

        int result = 0;
        for (int i = 0; i <s.length(); i++) {
            int s_int = s.charAt(i) - '0';
            result = result*10 + s_int;
        }

        System.out.println("correct input: " + result);
        return result;
    }
}
