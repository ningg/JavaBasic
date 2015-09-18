package top.ningg.java.basic;

/**
 * Created by guoning on 15/9/16.
 */
public class TestStringFormat {

    private static final int MAGICCARD_MAX_DENOMINATION = 2000000000;

    public static void main(String[] args) {

        int inputValue = MAGICCARD_MAX_DENOMINATION - 100;
        String result = String.format("%010d", MAGICCARD_MAX_DENOMINATION - inputValue);
        System.out.println(result);
    }
}
