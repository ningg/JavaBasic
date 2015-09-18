package top.ningg.java.basic;

import com.google.common.base.Splitter;
import com.google.common.collect.TreeMultimap;

import java.util.List;

/**
 * Created by guoning on 15/9/8.
 */
public class TestOfGuava {

    public static void main(String[] args) {
        new TestOfGuava().testTreeMultiMap();

    }

    public void testSplliter(){
//        List<String> receiveConfigStrings = Splitter.on(";").trimResults().omitEmptyStrings().splitToList("3;2");
        List<String> receiveConfigStrings = Splitter.on(";").trimResults().omitEmptyStrings().splitToList("3");
        System.out.println(receiveConfigStrings);
    }

    public void testTreeMultiMap(){
        TreeMultimap<String, Long> treeMultimap = TreeMultimap.create();
//        HashMultimap<String, Long> treeMultimap = HashMultimap.create();

        treeMultimap.put("1001", 120l);
        treeMultimap.put("0001", 20l);
        treeMultimap.put("0001", 21l);
        treeMultimap.put("0002", 22l);
        treeMultimap.put("0003", 23l);
        treeMultimap.put("0009", 29l);

        for (String singleKey : treeMultimap.keySet()){
            for (Long singleValue : treeMultimap.get(singleKey)){
                System.out.println(singleKey + " - " + singleValue);
            }
        }
    }
}
