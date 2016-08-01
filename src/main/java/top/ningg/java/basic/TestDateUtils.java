package top.ningg.java.basic;

import java.text.DateFormat;
import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;

/**
 * Created by guoning on 15/11/6.
 */
public class TestDateUtils {
    public static void main(String[] args) {
        String output = DateFormatUtils.format(new Date(), DateFormatUtils.ISO_DATE_FORMAT.getPattern());
        System.out.println(output);

        output = DateFormatUtils.format(new Date(), DateFormatUtils.ISO_DATETIME_FORMAT.getPattern());
        System.out.println(output);

        output = DateFormatUtils.format(new Date(), DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.getPattern());
        System.out.println(output);

        output = DateFormat.getInstance().format(new Date());
        System.out.println(output);

        output = DateFormat.getTimeInstance().format(new Date());
        System.out.println(output);

        output = DateFormat.getTimeInstance(DateFormat.FULL).format(new Date());
        System.out.println(output);

        output = DateFormat.getTimeInstance(DateFormat.LONG).format(new Date());
        System.out.println(output);

        output = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(new Date());
        System.out.println(output);

        output = DateFormat.getTimeInstance(DateFormat.SHORT).format(new Date());
        System.out.println(output);

        Date today = new Date();
        Date oneMonthBefore = new DateTime(today.getTime()).minusMonths(1).toDate();

        int days = Days.daysBetween(LocalDate.fromDateFields(oneMonthBefore), LocalDate.fromDateFields(today)).getDays();
        days = Days.daysBetween(LocalDate.fromDateFields(today), LocalDate.fromDateFields(oneMonthBefore)).getDays();

        System.out.println(days);
    }
}
