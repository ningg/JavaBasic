package top.ningg.java.basic;

/**
 * Created by guoning on 15/9/16.
 */
public class TestLong {

    public static void main(String[] args) {


        Long value = new Long(12);
        System.out.println(0 < value);
        System.out.println(0 >= value);


        value = new Long(-1);
        System.out.println(0 < value);
        System.out.println(0 >= value);


        String input = "1232123";
        Object obj = input;
        Number num = (Number) obj;
        long longNum = num.longValue();

        System.out.println(longNum);

        long valueLong = 1000L;

        System.out.println();
    }
}
