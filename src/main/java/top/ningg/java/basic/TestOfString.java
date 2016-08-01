package top.ningg.java.basic;

import org.apache.commons.lang3.StringUtils;

public class TestOfString {

    public static void main(String[] args) {
        String input = "《密室3之不可逃脱》";
        String result = extractProductName(input);
        System.out.println(result);
    }

    // 去掉产品名称前后的书名号
    private static String extractProductName(String productName) {
        String result = StringUtils.isEmpty(productName) ? "" : StringUtils.trim(productName);
        if (result.contains("《")) {
            result = result.substring(result.indexOf("《") + 1, result.indexOf("》"));
        }
        return result;
    }
}
