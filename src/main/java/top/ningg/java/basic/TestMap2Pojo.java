package top.ningg.java.basic;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import top.ningg.java.model.Foo;

import java.util.HashMap;

/**
 * Created by guoning on 2018/1/9.
 */
public class TestMap2Pojo {

    public static void main(String[] args) {
        shouldMapHashMapToFoo();
    }

    public static void shouldMapHashMapToFoo() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("a", "aaaa");
        map.put("b", "bbbb");
        //map.put("c", 1000);

        final ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        Foo foo = mapper.convertValue(map, Foo.class);

        System.out.println(foo);

    }

}
