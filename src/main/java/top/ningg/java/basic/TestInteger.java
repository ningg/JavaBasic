package top.ningg.java.basic;

/**
 * Created by guoning on 15/10/29.
 */
public class TestInteger {

    public static void main(String[] args) {

        Integer integerA = new Integer(1);
        Integer integerB = new Integer(1);

        if (integerA == integerB){
            System.out.println("new Integer(1) == new Integer(1)");
        }

        Integer integerA1 = 1;
        Integer integerB1 = 1;

        if (integerA1 == integerB1){
            System.out.println("整型自动装箱，两个对象相等");
        }

        Integer integerA1OfValueOf = Integer.valueOf(1);
        Integer integerB1OfValueOf = Integer.valueOf(1);

        if (integerA1OfValueOf == integerB1OfValueOf){
            System.out.println("Integer valueOf，两个对象相等");
        }

        Integer integerA1000 = 1000;
        Integer integerB1000 = 1000;

        if (integerA1000 == integerB1000){
            System.out.println("整型自动装箱，两个对象相等");
        }

        Integer integerA1O00fValueOf = Integer.valueOf(1000);
        Integer integerB1O00fValueOf = Integer.valueOf(1000);

        if (integerA1O00fValueOf == integerB1O00fValueOf){
            System.out.println("Integer valueOf，两个对象相等");
        }

        int max = Integer.MAX_VALUE;
        System.out.println(max);
    }
}
