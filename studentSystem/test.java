package studentSystem;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        generateCode();

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
        System.out.println(sb);
        return sb.toString();
    }
}
