package top.ningg.java.basic;

import com.google.common.collect.Lists;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.List;

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
    }
}
