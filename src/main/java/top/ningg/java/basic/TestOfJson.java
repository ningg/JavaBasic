package top.ningg.java.basic;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Sets;

import java.util.Set;

/**
 * Created by guoning on 16/11/17.
 */
public class TestOfJson {

    public static void main(String[] args) {
        Set<String> set = Sets.newHashSet();

        set.add("sdfasdf");
        set.add("sss");
        set.add("111");

        System.out.println(JSON.toJSON(set));
    }
}
