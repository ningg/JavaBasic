package top.ningg.java.basic;

import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by guoning on 2018/2/9.
 */
public class TestOfDateParse {

    public static void main(String[] args) {
        List<String>  dateStringList = new LinkedList<>();

        dateStringList.add("2/7/18");
        dateStringList.add("7月24日");
        dateStringList.add("2018年7月5日");

        for (String single : dateStringList){
            System.out.println(extractDate(single));
        }
    }

    // 根据日期字符, 转换为目标日期
    private static Date extractDate(String dateStr) {
        // 1. 2017-6-7
        // 2. 7/4 (2017 年)
        // 3. 8月3日(2017 年)
        // 4. 2017-10-25
        // 5. 6/15/17 (2017年6月15日)
        // 6. 2017年6月15日
        List<SimpleDateFormat> knownPatterns = new ArrayList<>();
        knownPatterns.add(new SimpleDateFormat("yyyy-M-d"));
        knownPatterns.add(new SimpleDateFormat("yyyy-MM-dd"));
        knownPatterns.add(new SimpleDateFormat("M/d/yy"));
        knownPatterns.add(new SimpleDateFormat("MM/dd/yy"));
        knownPatterns.add(new SimpleDateFormat("M/d/yyyy"));
        knownPatterns.add(new SimpleDateFormat("MM/dd/yyyy"));
        knownPatterns.add(new SimpleDateFormat("yyyy年M月d日"));
        knownPatterns.add(new SimpleDateFormat("yyyy年MM月dd日"));
        knownPatterns.add(new SimpleDateFormat("M月d日"));
        knownPatterns.add(new SimpleDateFormat("M/d"));

        // 当天的时间, 作为基准时间, 校正解析出的
        Date today = new Date();
        today = DateUtils.addDays(today, 1);

        Date earliestDate = new Date();
        earliestDate = DateUtils.addYears(earliestDate, -3);
        for (SimpleDateFormat pattern : knownPatterns) {
            try {
                // Take a try
                Date currDate = new Date(pattern.parse(dateStr).getTime());
                // 时间过早, 重置时间
                if (currDate.before(earliestDate)){
                    currDate = DateUtils.setYears(currDate, 2017);
                    return currDate;
                }
                // 日期转换
                if (currDate.after(today)) {
                    currDate = DateUtils.setYears(currDate, 2017);
                    return currDate;
                }
                return currDate;
            } catch (ParseException e) {
                // Loop on
            }
        }
        return null;
    }
}
