package test_year;

import java.time.LocalDate;
import java.util.Calendar;

public class year {
    public static void main(String[] args) {
        //jdk7
        Calendar c = Calendar.getInstance();
        c.set(2001,0,1);
        c.add(Calendar.DAY_OF_YEAR,-1);
        int day = c.get(Calendar.DAY_OF_YEAR);
        System.out.println(day);

        //JDK8
        LocalDate ld = LocalDate.of(2000,3,1);
        LocalDate ld2 = ld.minusDays(1);
        int day2 = ld2.getDayOfMonth();
        System.out.println(day2);

        System.out.println(ld.isLeapYear());
    }
}
