package top.ningg.java.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.joda.time.DateTimeUtils;

/**
 * Created by guoning on 2019/3/12.
 */
public class TestOfDateFormat {

    private static final String DATE_PATTERN = "EEE, d MMM yyyy HH:mm:ss z";

    public static void main(String[] args) {

        // 3. 生成BA参数 Date，格式为格林时间
        String DATE_PATTERN = "EEE, d MMM yyyy HH:mm:ss z";
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_PATTERN, Locale.ENGLISH);
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        String date = sdf.format(new Date());

        System.out.println(date);


        String date2 = DateFormatUtils.format(new Date(), DateFormatUtils.SMTP_DATETIME_FORMAT.getPattern());
        System.out.println(date2);
        
    }

}



