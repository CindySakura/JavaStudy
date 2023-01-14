package Login;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class loginWoCount {
    public static void main(String[] args) throws IOException {
        //correct username and password
        BufferedReader br = new BufferedReader(new FileReader("login/src/Login/user.txt"));
        String[] unamepw = br.readLine().split("=|&");
        br.close();

        //input username and password
        Scanner sc = new Scanner(System.in);
        System.out.println("please input your username:");
        String uname = sc.nextLine();
        System.out.println("please input your password:");
        String pw = sc.nextLine();

        if(unamepw[1].equals(uname) && unamepw[3].equals(pw)){
            System.out.println("login successfully");
        }else{
            System.out.println("login failed");
        }
    }
}
