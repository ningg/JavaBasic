package top.ningg.java.basic;

/**
 * Created by guoning on 15/9/1.
 */
public class BitWiseOperate {
    public static void main(String[] args) {
        int result = 0;
        result |= 3;
        result |= 4;
        result = 256;
        result &= 256;
        System.out.println(result);
    }
}
