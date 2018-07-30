package top.ningg.java.basic;

import java.util.Calendar;

/**
 * Created by guoning on 2018/5/17.
 */
public class TestOfCalendar {

    public static void main(String[] args) {
        Calendar startTimeCalendar = Calendar.getInstance();
        startTimeCalendar.set(Calendar.YEAR, 2018);
        startTimeCalendar.set(Calendar.MONTH, 5 - 1);
        startTimeCalendar.set(Calendar.DAY_OF_MONTH, 10);
        startTimeCalendar.set(Calendar.HOUR_OF_DAY, 0);
        startTimeCalendar.set(Calendar.MINUTE, 0);
        startTimeCalendar.set(Calendar.SECOND, 0);


        Calendar endTimeCalendar = Calendar.getInstance();
        endTimeCalendar.set(Calendar.YEAR, 2018);
        endTimeCalendar.set(Calendar.MONTH, 5 - 1);
        endTimeCalendar.set(Calendar.DAY_OF_MONTH, 16);
        endTimeCalendar.set(Calendar.HOUR_OF_DAY, 0);
        endTimeCalendar.set(Calendar.MINUTE, 0);
        endTimeCalendar.set(Calendar.SECOND, 0);

        System.out.println(startTimeCalendar.getTime());
        System.out.println(endTimeCalendar.getTime());
    }

}
