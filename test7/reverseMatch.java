package test7;

public class reverseMatch {
    public static void main(String[] args) {
        //Define Strings
        String strA = "abcde";
        String strB = "cdeab";

        //rotate Strings
        boolean flag = check(strA,strB);
        System.out.println(flag);

    }

    public static String rotate(String str){
        //substring
        //array of char

        //substring
/*        char c = str.charAt(0);
        String rest = str.substring(1);
        return rest + c;*/

        //array of char
        char[] arr = str.toCharArray();
        char first = arr[0];
        for (int i = 1; i < str.length(); i++) {
            arr[i-1] = arr[i];
        }
        arr[str.length()-1] = first;
        String result = new String(arr);
        return result;
    }

    public static boolean check(String strA,String strB){
        for (int i = 0; i < strA.length(); i++) {
            if(strA.equals(strB)){
                return true;
            }
            strA = rotate(strA);
        }
        return false;

        //
    }
}
