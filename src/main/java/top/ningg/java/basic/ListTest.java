package top.ningg.java.basic;

import java.util.List;
import java.util.Set;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/**
 * Created by guoning on 15/8/27.
 */
public class ListTest {
    public static void main(String[] args) {
        List<NameValuePair> pairs = Lists.newLinkedList();
        pairs.add(new BasicNameValuePair("business", String.valueOf(1)));
        pairs.add(new BasicNameValuePair("platform", String.valueOf(1)));
        System.out.println(pairs);

        List<Integer> intList = Lists.newArrayList();
        intList.add(1);
        intList.add(234);
        boolean result = intList.contains(234);
        System.out.println(result);

        Set<Integer> set = Sets.newHashSet(intList);
        System.out.println(set);

        List testNull = Lists.newLinkedList();
        testNull.add(null);
        testNull.add(null);
        testNull.add(null);

        System.out.println(testNull.size());

        for (Object single: testNull) {
            if (null == single){
                System.out.println("null");
            }
        }

        List<NameValuePair> testList = null;
        List<Integer> hahaTest = (List<Integer>) (List<?>) testList;
        System.out.println(hahaTest);

    }
}
