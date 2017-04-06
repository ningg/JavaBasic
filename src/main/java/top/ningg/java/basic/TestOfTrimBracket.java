package top.ningg.java.basic;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

import com.google.common.collect.Lists;

/**
 * Created by guoning on 16/8/5.
 */
public class TestOfTrimBracket {

    public static final String BRACKET_REGEX = "^(<(.*)>|《(.*)》|\\[(.*)\\]|【(.*)】|\"(.*)\"|'(.*)'|『(.*)』|「(.*)」|\\{(.*)\\})$";
    public static final Pattern BRACKET_PATTERN = Pattern.compile(BRACKET_REGEX);
    private static final Matcher BRACKET_MATCHER = BRACKET_PATTERN.matcher("");

    public static void main(String[] args) {
        List<String> stringList = Lists.newArrayList("《A》", "<A>", "《<A>》", "<《A》>", "《A》+《B》", "<A>+<B>", "《A+《B》》", "<A+《B》>", "[A]", "【A】", "\"A\"", "'A'",
                "『A』", "「A」", "{A}");
        List<String> resultList = Lists.newArrayList();

        for (String single : stringList) {
            single = removeAngleBracket(single);
            resultList.add(single);
        }

        System.out.println(stringList);
        System.out.println(resultList);

    }

    private static String removeAngleBracket(String title) {
        title = StringUtils.trim(title);
        if (StringUtils.isBlank(title)) {
            return title;
        }

        // 如果匹配, 则递归调用
        BRACKET_MATCHER.reset(title);
        if (BRACKET_MATCHER.find()) {
            // 当且仅当子字符串符合规则时, 过滤掉首尾字符.
            String subString = title.substring(1, title.length() - 1);

            if (StringUtils.isNotBlank(subString)) {
                if ((subString.indexOf("<") <= subString.indexOf(">")) && (subString.indexOf("《") <= subString.indexOf("》"))
                        && (subString.indexOf("[") <= subString.indexOf("]")) && (subString.indexOf("【") <= subString.indexOf("】"))
                        && (subString.indexOf("\"") <= subString.indexOf("\"")) && (subString.indexOf("'") <= subString.indexOf("'"))
                        && (subString.indexOf("『") <= subString.indexOf("』")) && (subString.indexOf("「") <= subString.indexOf("」"))
                        && (subString.indexOf("{") <= subString.indexOf("}"))) {
                    title = removeAngleBracket(subString);
                }
            }
        }

        return title;
    }
}
