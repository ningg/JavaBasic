package top.ningg.java.basic;

/**
 * Created by guoning on 2019/1/3.
 */
public class TestOfStringContain {

    public static void main(String[] args) {
        String originStrA = "原交易不存在或状态不正确[2011001]";
        String originStrB = "原交易不存在或状态不正确[2011001]: 原路退款失败，需人工转账 ";
        String suffixStr = "原路退款失败，需人工转账";

        boolean resultA = originStrA.contains(suffixStr);
        boolean resultB = originStrB.contains(suffixStr);

        System.out.println(resultA);
        System.out.println(resultB);
    }

}