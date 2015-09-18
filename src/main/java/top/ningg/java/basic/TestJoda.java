package top.ningg.java.basic;

import org.joda.time.DateTime;
import org.joda.time.Days;

import java.util.Date;

/**
 * Created by guoning on 15/9/16.
 */
public class TestJoda {

    public static void main(String[] args) {
        Date startDate = new Date();
        Date endDate = new Date();
        endDate.setTime(startDate.getTime() - 24 * 60 * 60 * 1000);

        int result = Days.daysBetween(new DateTime(startDate.getTime()), new DateTime(endDate.getTime())).getDays();
        System.out.println(result);

        result = Days.daysBetween(new DateTime(endDate.getTime()), new DateTime(startDate.getTime())).getDays();
        System.out.println(result);

        long inputDateTime = 1442641202;
        System.out.println(new Date(inputDateTime * 1000));
    }
}
