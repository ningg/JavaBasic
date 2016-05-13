package top.ningg.java.basic;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by guoning on 16/4/28.
 */
public class TestOfList {


    public static void main(String[] args) {

        List<Integer> numbers = Lists.newArrayList(1,2,3,4,5,6,15,20);

        List<Integer> bigNums = Lists.newArrayList(Collections2.filter(numbers, new Predicate<Integer>() {
            @Override
            public boolean apply(Integer input) {
                return input > 10;
            }
        }));

        System.out.println(bigNums);
    }
}
