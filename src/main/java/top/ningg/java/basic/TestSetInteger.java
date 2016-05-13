package top.ningg.java.basic;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

/**
 * Created by guoning on 16/2/22.
 */
public class TestSetInteger {
    public static void main(String[] args) {
        Set<Integer> test = ImmutableSet.of(1, 2000, 65533, 4000000);

        System.out.println(test.contains(65533));
        System.out.println(test.contains(4000000));
    }
}
