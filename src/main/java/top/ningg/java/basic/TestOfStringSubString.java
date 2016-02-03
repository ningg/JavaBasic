package top.ningg.java.basic;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by guoning on 16/2/2.
 */
public class TestOfStringSubString {

    public static void main(String[] args) {
        String splitter = "?";

        String input1 = "http://show.meituan.com/project/6303770?ci=89&f=iphone&lat=31.831285&lng=119.956282&msid=82F6B54A-3D8B-404F-9630-D513EC8310F02016-02-02-20-44502&token=E45_9eiUrkaY5qGRMa_xDNPUcsEAAAAAaQEAAOI0yjX3fgCaFwx5DPesAhTXQjURQonNnZuEO_n9eYDg2F3_KykEHrYVi_hUghCTwA&userid=97982332&utm_campaign=AgroupBgroupD200Ghomepage_category20_99999__a1&utm_content=9B36E2D858FD7A12406A34065436C79BF49A73688DBC45E97764B3E86EAA34A1&utm_medium=iphone&utm_source=AppStore&utm_term=6.4&uuid=9B36E2D858FD7A12406A34065436C79BF49A73688DBC45E97764B3E86EAA34A1&version_name=6.4";
        String input2 = "http://show.meituan.com/project/6303770asldkfalksdjf";
        String input3 = "";


        oriSubStr(splitter, input1);
        oriSubStr(splitter, input2);
        oriSubStr(splitter, input3);

        utilSubString(splitter, input1);
        utilSubString(splitter, input2);
        utilSubString(splitter, input3);
    }

    public static void utilSubString(String splitter, String input){
        input = StringUtils.substringBefore(input, splitter);
        System.out.println(input);
    }

    private static void oriSubStr(String splitter, String input) {
        if (StringUtils.isNotBlank(input)) {
            if (input.contains(splitter)) {
                input = input.substring(0, input.indexOf(splitter));
            }
            System.out.println(input);
        }
    }
}
