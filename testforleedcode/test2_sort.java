package testforleedcode;

import java.util.Arrays;
import java.util.Comparator;

public class test2_sort {
    public static void main(String[] args) {
        gf gf1 = new gf("a",18,165);
        gf gf2 = new gf("b",19,164);
        gf gf3 = new gf("c",20,165);

        gf[] arr = {gf1,gf2,gf3};

        Arrays.sort(arr, new Comparator<gf>() {
            @Override
            public int compare(gf o1, gf o2) {
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0? o1.getHeight() - o2.getHeight() : temp;
                temp = temp == 0? o1.getName().compareTo(o2.getName()): temp;
                if(temp > 0){
                    return 1;
                } else if (temp < 0) {
                    return -1;
                }else{
                    return 0;
                }

            }
        });

        System.out.println(Arrays.toString(arr));
    }
}
