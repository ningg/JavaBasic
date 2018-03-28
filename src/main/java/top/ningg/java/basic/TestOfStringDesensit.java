package top.ningg.java.basic;

import org.apache.commons.lang3.StringUtils;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by guoning on 2018/3/23.
 */
public class TestOfStringDesensit {


    public static void main(String[] args) {
        List<String> inputStrList = new LinkedList<>();
        inputStrList.add("");
        inputStrList.add("12");
        inputStrList.add("232");
        inputStrList.add("2342");
        inputStrList.add("你好");
        inputStrList.add("jp_sh330631623@126.com");
        inputStrList.add("18501050232");
        inputStrList.add("kittennunu@aliyun.com");
        inputStrList.add("@kittennunu@aliyun.com");
        inputStrList.add("1@kittennunu@aliyun.com");

        for (String singleString : inputStrList) {
            processStr(singleString);
        }


    }

    private static void processStr(String inputStr) {
        String manualRefundAccountInfo = inputStr;
        // 转账账户, 脱敏处理:
        // 0. 邮箱:包含 @ 字符, 则, 替换隐藏其前面一个字符;
        // 1. 手机号: 隐藏中间 4 个字符;
        // 1. 长度 <= 1: 不处理
        // 2. 长度 属于[2,6]: 隐藏前「1/2」
        // 3. 长度 属于[7,无穷): 隐藏中间 4 个
        String processedManualRefundAccountInfo = manualRefundAccountInfo;
        if (StringUtils.isNotBlank(manualRefundAccountInfo)) {
            if (manualRefundAccountInfo.contains("@")) {
                int index = manualRefundAccountInfo.lastIndexOf("@");
                // 只处理最后正常情况
                if (index >= 1) {
                    processedManualRefundAccountInfo = manualRefundAccountInfo.substring(0, index - 1) + "*" + manualRefundAccountInfo.substring(index);
                }
            } else if (manualRefundAccountInfo.length() == 11 && StringUtils.isNumeric(manualRefundAccountInfo)) {
                processedManualRefundAccountInfo = manualRefundAccountInfo.substring(0, 3) +
                        "*" +
                        manualRefundAccountInfo.substring(7, 11);
            } else {

                int totalLength = manualRefundAccountInfo.length();
                if (totalLength <= 1) {
                    processedManualRefundAccountInfo = manualRefundAccountInfo;
                } else if (totalLength > 1 && totalLength <= 6) {
                    String stringBuilder = "*" +
                            manualRefundAccountInfo.substring(totalLength / 2, totalLength);
                    processedManualRefundAccountInfo = stringBuilder;
                } else if (totalLength > 7) {
                    // a. 包含「@」则, 只对其之前部分处理
                    // b. 不包含「@」则, 只对其之前部分处理

                    String stringBuilder = manualRefundAccountInfo.substring(0, totalLength / 2 - 2) +
                            "*" +
                            manualRefundAccountInfo.substring(totalLength / 2 + 2, totalLength);
                    processedManualRefundAccountInfo = stringBuilder;
                }

            }

        }

        System.out.println(processedManualRefundAccountInfo);
    }
}
