package test7;

public class lastWord {
    public static void main(String[] args) {
        String str = "hello world        dasdaw";
        int count = 0;
        for (int i = str.length()-1; i >=0; i--) {
            if(str.charAt(i)==' '){
                break;
            }
            count ++;
        }
        System.out.println(count);
    }
}
