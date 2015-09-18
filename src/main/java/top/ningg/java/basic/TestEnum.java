package top.ningg.java.basic;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by guoning on 15/8/27.
 */
public class TestEnum {
    public enum Light {
        RED(1),YELLOW,BLUE;



        Light(int i) {
            this.i = i;
        }

        private int i;

        Light() {

        }
    }

    public static void main(String args[]) {
        List<Integer> inputList = Lists.newArrayList(1);
        System.out.println(inputList.get(0));

        for(Light light:Light.values()) {
            System.out.println(light.i);
        }
        System.out.println(Light.valueOf("RED"));
    }
}
