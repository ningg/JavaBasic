package top.ningg.java.basic;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Sets;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by guoning on 16/11/17.
 */
public class TestOfJson {

    // 请求参数：常量
    private static final String START_TIME_PARAM = "startTime";
    private static final String END_TIME_PARAM = "endTime";

    public static void main(String[] args) {
        Set<String> set = Sets.newHashSet();

        set.add("sdfasdf");
        set.add("sss");
        set.add("111");

        System.out.println(JSON.toJSON(set));

        Map<String, String> map = new HashMap<>();

        map.put("startTime", "2017-04-21 00:00:00");
        map.put("endTime", "2017-04-21 23:59:59");

        System.out.println(JSON.toJSON(map));
        System.out.println(JSON.toJSONString(map));

        Map<String, String> mapA = new HashMap<>();
        Date currDate = new Date();
        String currDateString = new SimpleDateFormat("yyyy-MM-dd").format(currDate);
        mapA.put(START_TIME_PARAM, String.format("%s %s", currDateString, "00:00:00"));
        mapA.put(END_TIME_PARAM, String.format("%s %s", currDateString, "23:59:59"));
        System.out.println(JSON.toJSONString(mapA));
    }
}
