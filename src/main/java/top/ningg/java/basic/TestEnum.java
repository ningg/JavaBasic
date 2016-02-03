package top.ningg.java.basic;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by guoning on 15/8/27.
 */
public class TestEnum {
    public enum Light {
        RED(1),YELLOW(0),BLUE(7);

        private int i;

        Light() {
        }

        Light(int i) {
            this.i = i;
        }
    }

    public static void main(String args[]) {

        for(Light light:Light.values()) {
            System.out.println(String.format("(name:%s, i:%s, ordinal:%s)", light.name(), light.i, light.ordinal()));
        }

        System.out.println("-----next-----");
        System.out.println(Light.valueOf("RED"));
    }
}
