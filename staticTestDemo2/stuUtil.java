package staticTestDemo2;

import java.util.ArrayList;

public class stuUtil {
    private stuUtil(){}

    public static int maxAge(ArrayList<stu> list){
        int maxListAge = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            int age = list.get(i).getAge();
            if(age > maxListAge){
                maxListAge = age;
            }
        }
        return maxListAge;
    }
}
