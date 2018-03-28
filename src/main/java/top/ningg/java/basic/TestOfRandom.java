package top.ningg.java.basic;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * Created by guoning on 2017/10/24.
 */
public class TestOfRandom {

    public static void main(String[] args) {
        for (int index = 0; index < 100; index++) {
            String paramId = RandomStringUtils.randomNumeric(6);
            System.out.println(paramId);
        }
    }
}
