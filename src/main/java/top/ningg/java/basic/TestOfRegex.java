package top.ningg.java.basic;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by guoning on 2017/9/19.
 */
public class TestOfRegex {
    private static final String REGEX_FOR_IPADDRESS_WITH_PORT = ".*//(\\d+\\.\\d+\\.\\d+\\.\\d+)\\:(\\d+).*";
    private static final String KEY_FORMAT = "%s:%s";

    // 「邮箱」的正则表达式
    private static final String USER_ACCOUNT_EMAIL_REG_EXP = "^([a-z0-9A-Z_\\.-]+[-|\\.]?)+[a-z0-9A-Z_\\.-]?@([a-z0-9A-Z_\\.-]+(-[a-z0-9A-Z_\\.-]+)?\\.)+[a-zA-Z]{2,}$";
    private static final Pattern USER_ACCOUNT_EMAIL_PATTERN = Pattern.compile(USER_ACCOUNT_EMAIL_REG_EXP);

    public static void main(String[] args) {
        List<String> inputUrlList = new LinkedList<>();
        inputUrlList.add("http://10.201.15.2:10888");
        inputUrlList.add("http://10.201.19.135:8080/mobike-api/health");

        for (String single : inputUrlList) {
            Pattern pattern = Pattern.compile(REGEX_FOR_IPADDRESS_WITH_PORT);
            Matcher matcher = pattern.matcher(single);
            String key = null;
            if (matcher.matches()) {
                key = String.format(KEY_FORMAT, matcher.group(1), matcher.group(2));
            }
            System.out.println(key);
        }

        String accountNum = "m1@chang.ly";
        Matcher userAccountEmailMatcher = USER_ACCOUNT_EMAIL_PATTERN.matcher(accountNum);
        System.out.println(userAccountEmailMatcher.matches());
    }
}
