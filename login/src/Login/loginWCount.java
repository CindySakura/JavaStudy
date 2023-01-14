package Login;

import java.io.*;
import java.util.Scanner;

public class loginWCount {
    public static void main(String[] args) throws IOException {
        //correct username and password
        BufferedReader br = new BufferedReader(new FileReader("login/src/Login/userWCount.txt"));
        String[] info = br.readLine().split("=|&");
        br.close();

        //input username and pw
        Scanner sc = new Scanner(System.in);
        System.out.println("please input your username:");
        String uname = sc.nextLine();
        System.out.println("please input your password:");
        String pw = sc.nextLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter("login/src/Login/userWCount.txt"));
        int count = Integer.parseInt(info[5]);
        if(count >= 3){
            System.out.println("account has been locked");
            bw.write("username="+ info[1] +"&password="+ info[3] +"&count="+ (count + 1));
        } else if(info[1].equals(uname) && info[3].equals(pw)){
            System.out.println("login successfully");
            bw.write("username="+ info[1] +"&password="+ info[3] +"&count=0");
        }else{
            System.out.println("login failed, " +(3-1-count)+" times left");
            bw.write("username="+ info[1] +"&password="+ info[3] +"&count="+ (count + 1));
        }
        bw.close();
    }
}
