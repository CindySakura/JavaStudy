package test7;

public class stringToNum {
    public static void main(String[] args) {
        String num1 = "15";
        String num2 = "3";

        int[] arr1 = strToNum(num1);
        int[] arr2 = strToNum(num2);
        int numint1 = arrToNum(arr1);
        int numint2 = arrToNum(arr2);
        System.out.println(numint1*numint2);

    }

    public static int[] strToNum(String str){
        int[] numarr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            numarr[i] = c-48;
        }
        return numarr;
    }

    public static int arrToNum(int[] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result*10 + arr[i];
        }
        return result;
    }
}
