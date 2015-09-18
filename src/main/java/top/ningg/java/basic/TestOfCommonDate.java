package top.ningg.java.basic;

import org.apache.commons.lang3.time.DateUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by guoning on 15/9/16.
 */
public class TestOfCommonDate {
    public static void main(String[] args) {
        Date outputOfDate = DateUtils.truncate(new Date(), Calendar.HOUR);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(outputOfDate));
    }
}
