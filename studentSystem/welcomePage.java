package studentSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class welcomePage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<user> ulist = new ArrayList<>();
        loop:while(true){
            System.out.println("welcome page");
            System.out.println("1.login");
            System.out.println("2.register");
            System.out.println("3.forget password");
            System.out.println("4.view users");//
            System.out.println("exit: other option");
            System.out.println("choose one option");

            String choice = sc.next();

            switch (choice){
                case "1":
                    //login
                    login(ulist);
                    break;
                case "2":
                    //register
                    register(ulist);
                    break;
                case "3":
                    //forget password
                    forget(ulist);
                    break;
                case "4":
                    //forget password
                    view(ulist);
                    break;
                default:
                    //wrong input
                    System.out.println("other input, exit system");
                    break loop;
            }
        }
    }

    private static void login(ArrayList<user> ulist){
        Scanner sc = new Scanner(System.in);
        System.out.println("please type in your username:");
        String uname = sc.next();

        int contain = contains(uname,ulist);
        if(contain<0){
            System.out.println("has not registered yet");
            return;
        }

        for (int i1 = 0; i1 < 3; i1++) {
            System.out.println("please type in your password:");
            String pw = sc.next();

            String Scode = generateCode();
            System.out.println("please type in the code:" + Scode);
            String code = sc.next();
            if(ulist.get(contain).getPw().equals(pw) && code.equalsIgnoreCase(Scode)){
                System.out.println("Login Success! Go to student system.");
                stuMain sm = new stuMain();
                sm.startStudentSystem();
                return;
            }else{
                System.out.println("wrong password or code," + (3-1-i1)+"times left");
            }
        }
        return;
    }

    private static void register(ArrayList<user> ulist){
        //username check
        Scanner sc = new Scanner(System.in);
        String username;
        while(true){
            System.out.println("type in your username");
            username = sc.next();
            boolean flag = usernameRule(username, ulist);
            if(flag){
                break;
            }
        }

        //pw check
        String pw1 = checkpw();

        //idNum check
        String idNum;
        while(true){
            System.out.println("type in your idNum");
            idNum = sc.next();
            boolean checkid = idRule(idNum);
            if(checkid){
                break;
            }
        }

        String phone;
        while(true){
            System.out.println("type in your phone");
            phone = sc.next();
            boolean isphone = phoneRule(phone, 11,true);
            if(isphone){
                break;
            }
        }

        user u = new user(username, pw1, idNum, phone);
        ulist.add(u);
        System.out.println("Success!");
    }

    private static void forget(ArrayList<user> ulist){
        Scanner sc = new Scanner(System.in);
        System.out.println("put in your username");
        String uname = sc.next();
        int contain = contains(uname,ulist);

        if(contain<0){
            System.out.println("has not register yer");
            return;
        }
        System.out.println("put in your id number");
        String id = sc.next();
        System.out.println("put in your phone number");
        String phoneN = sc.next();

        user u = ulist.get(contain);
        if(u.getIdNum().equalsIgnoreCase(id) && u.getPhone().equals(phoneN)){
            //System.out.println("New password:");
            String newpw = checkpw();
            u.setPw(newpw);
            System.out.println("Password Changed Successfully!");
        }else{
            System.out.println("wrong id number or phone number");
        }
        return;
    }

    private static void view(ArrayList<user> ulist){
        System.out.println("username\tid Number \t phone");
        for (int i = 0; i < ulist.size(); i++) {
            user u = ulist.get(i);
            System.out.println(u.getUsername() +"\t"+u.getIdNum() + "\t"+u.getPhone());
        }
    }

    private static int contains(String username,ArrayList<user> ulist){
        for (int i = 0; i < ulist.size(); i++) {
            user u = ulist.get(i);
            if(u.getUsername().equals(username)){
                return i;
            }
        }
        return -1;
    }

    private static boolean usernameRule(String username,ArrayList<user> ulist){
        //check length and other things first
        int ulength = username.length();
        if(ulength<3 || ulength > 15){
            System.out.println("wrong length");
            return false;
        }

        int count = 0;
        for (int i = 0; i < ulength; i++) {
            char c = username.charAt(i);
            if((c>='a'&& c<='z') || (c>='A'&&c<='Z') ){
                count ++;
            }else if (c<'0' || c>'9') {
                System.out.println("wrong char, only number and alphabet");
                return false;
            }
        }
        if(count == 0){
            System.out.println("no alphabet");
            return false;
        }
        //check existence last
        int contain = contains(username,ulist);
        if(contain>=0){
            System.out.println("username existed, try another one");
            return false;
        }
        return true;
    }

    private static boolean idRule(String idNum){
/*        int len = idNum.length();
        if(len != 5){
            System.out.println("wrong id length");
            return false;
        }
        if(idNum.charAt(0) == '0'){
            System.out.println("first char is 0");
            return false;
        }
        for (int i = 0; i < len-1; i++) {
            if(idNum.charAt(i) <'0'||idNum.charAt(i) > '9'){
                System.out.println("not figures");
                return false;
            }
        }*/
        int len = idNum.length();
        boolean flag = phoneRule(idNum, 5,false);
        if(flag){
            if((idNum.charAt(len-1) != 'x' && idNum.charAt(len-1) != 'X')&&
                    (idNum.charAt(len-1) < '0' || idNum.charAt(len-1) > '9')){
                System.out.println("last digit is wrong");
                return false;
            }
            return true;
        }else{
            return false;
        }
    }

    private static boolean phoneRule(String phone, int length, boolean isphone){
        //len is the length of string phone, int length is the standard length of phone
        int len = phone.length();
        if(len != length){
            System.out.println("wrong input length");
            return false;
        }
        if(phone.charAt(0) == '0'){
            System.out.println("first char is 0");
            return false;
        }

        if(!isphone){
            len = len-1;
        }

        for (int i = 0; i < len; i++) {
            if(phone.charAt(i) <'0'||phone.charAt(i) > '9'){
                System.out.println("not figures");
                return false;
            }
        }
        return true;
    }

    private static String generateCode(){
        int codeLength = 4;
        Random rd = new Random();
        char[] code = new char[codeLength];
        //System.out.println((char)(97+25));
        for (int i = 0; i < codeLength-1; i++) {
            int charCode = rd.nextInt(26)+97;
            code[i] += (char)charCode;
        }

        code[codeLength-1] = (char)(rd.nextInt(10)+48);
        int index = rd.nextInt(codeLength);

        char temp = code[index];
        code[index] = code[codeLength-1];
        code[codeLength-1] = temp;

        StringBuilder sb = new StringBuilder();
        //String Scode = "";
        for (int i = 0; i < codeLength; i++) {
            sb.append(code[i]);
        }
        return sb.toString();
    }
    private static String checkpw(){
        Scanner sc = new Scanner(System.in);
        String pw1;
        String pw2;
        while(true){
            System.out.println("type in your pw, first time");
            pw1 = sc.next();
            System.out.println("type in your pw, second time");
            pw2 = sc.next();
            if(pw1.equals(pw2)){
                return pw1;
            }else{
                System.out.println("passwords do not match, try again");
            }
        }
    }

}
