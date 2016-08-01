package top.ningg.java.basic;

import java.util.List;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

/**
 * Created by guoning on 16/4/28.
 */
public class TestOfList {

    public static void main(String[] args) {

        List<Integer> numbers = Lists.newArrayList(1, 2, 3, 4, 5, 6, 15, 20);

        List<Integer> bigNums = Lists.newArrayList(Collections2.filter(numbers, new Predicate<Integer>() {
            @Override
            public boolean apply(Integer input) {
                return input > 10;
            }
        }));

        System.out.println(bigNums);

        List<Integer> testNull = Lists.newArrayList();

        for (Integer input : testNull) {
            System.out.println(input);
        }

        int offset = 0;
        int limit = 2;
        for (int index = offset; index < numbers.size(); index += limit) {
            System.out.println(numbers.subList(index, (index + limit < numbers.size()) ? (index + limit) : numbers.size()));
        }

    }
}
