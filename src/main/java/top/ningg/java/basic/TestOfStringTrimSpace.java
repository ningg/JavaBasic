package top.ningg.java.basic;

import com.google.common.collect.Lists;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by guoning on 2018/6/22.
 */
public class TestOfStringTrimSpace {

    public static void main(String[] args) {
        List<String> stringList = new LinkedList<>();

        stringList.add(null);
        stringList.add("   ");
        stringList.add(" 111");
        stringList.add("222   ");
        stringList.add("23 234234");
        stringList.add("4002632001201612173067216962");
        stringList.add("4002632001201612173067216962");
        stringList.add("400263200  120161217,3067216962");
        stringList.add("40026320012  01612;17306721  6962");
        stringList.add("40026。3200120。16121；。73067216962");

        List<String> resultList = Lists.newArrayListWithCapacity(stringList.size());

        for (String single : stringList) {
            // resultList.add(StringUtils.replace(single, " ", ""));
            resultList.add(StringUtils.replacePattern(single, "[\\s;,，；。]", ""));
        }

        for (String single : resultList) {
            System.out.println(single + ",");
        }

    }

}
