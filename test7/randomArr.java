package test7;

import java.util.Random;

public class randomArr {
    public static void main(String[] args) {
        //1.type in string
        String str = "abcdefg";
        //2.convert string into chararray
        char[] c = str.toCharArray();
        //3.randomize the chararray
        char[] chararr = randomize(c);
        String result = new String(chararr);
        System.out.println(result);
    }
    public static char[] randomize(char[] c){
        Random rand = new Random();
        for (int i = 0; i < c.length; i++) {
            int randNum = rand.nextInt(c.length);
            char temp = c[i];
            c[i] = c[randNum];
            c[randNum] = temp;
        }
        return c;
    }
}
