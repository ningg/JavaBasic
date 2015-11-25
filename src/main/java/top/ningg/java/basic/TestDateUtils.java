package top.ningg.java.basic;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.text.DateFormat;
import java.util.Date;

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
    }
}
