package staticTestDemo2;

import java.util.ArrayList;

public class stuMain {
    public static void main(String[] args) {
        ArrayList<stu> list = new ArrayList<>();

        stu s1 = new stu("a",12,"male");
        stu s2 = new stu("b",13,"female");
        stu s3 = new stu("c",12,"female");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        int maxListAge = stuUtil.maxAge(list);

        System.out.println(maxListAge);
    }
}
