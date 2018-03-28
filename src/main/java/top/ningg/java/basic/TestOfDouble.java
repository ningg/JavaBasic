package top.ningg.java.basic;

import org.apache.commons.lang3.StringUtils;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by guoning on 2017/7/26.
 */
public class TestOfDouble {

    public static void main(String[] args) {
        List<Double>  inputDoubleList = new LinkedList<>();

        inputDoubleList.add(123D);
        inputDoubleList.add(12.3D);
        inputDoubleList.add(-123D);
        inputDoubleList.add(-1.23D);
        inputDoubleList.add(1D);
        inputDoubleList.add(0D);
        inputDoubleList.add(0.0D);

        List<Integer> resultStr = new LinkedList<>();
        for (Double single : inputDoubleList){
            resultStr.add(preProcessDouble(single));
        }

        System.out.println(resultStr);

    }

    private static  Integer preProcessDouble(Double input){
        if (null == input){
            return null;
        }
        String lngStr = String.valueOf(input);
        lngStr = lngStr.replace(".", "");
        lngStr = lngStr.replace("-", "");

        int lngLength = lngStr.length();
        String value = (lngLength > 2 ? lngStr.substring(lngLength -2, lngLength) : lngStr);
        value = value.trim();
        if (StringUtils.isNumeric(value)){
            return Integer.valueOf(value);
        }
        return null;
    }
}
