package top.ningg.java.basic;

import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * Created by guoning on 17/5/9.
 */
public class TestOfForceConvert {

    public static void main(String[] args) {
        Object obj = null;

        List<String> result = (List<String>) obj;

        System.out.println(JSON.toJSON(result));
    }
}
