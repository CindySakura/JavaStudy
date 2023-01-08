package test5;

public class reverseString {
    public static void main(String[] args) {
        String res = reverser("abc");
        System.out.println(res);
    }

    public static String reverser(String str){
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            char c = str.charAt(i);
            result += c;
        }
        return result;
    }
}
