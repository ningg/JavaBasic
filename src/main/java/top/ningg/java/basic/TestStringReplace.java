package top.ningg.java.basic;

import com.google.common.base.CharMatcher;

/**
 * Created by guoning on 15/9/10.
 */
public class TestStringReplace {

    public static void main(String[] args) {
        // String input = "fb7d27a5-4403-4107-a5f2-2001630c6952";
        String input = "fb7d27a5-4403-4107-a5f2-2001630c6952";

        // for (int index = 0; index < 9 ; index++){
        // input += input;
        // }

        long resultOfCharMatcher = testGuavaCharMatcher(input);
        long resultOfReplace = testReplace(input);
        long resultOfBuilder = testStringBuilder(input);

        System.out.println(resultOfCharMatcher + " ns(CharMatcher)");
        System.out.println(resultOfReplace + " ns(ReplaceAll)");
        System.out.println(resultOfBuilder + " ns (StringBuilder)");

    }

    public static long testReplace(String input) {
        long startTime = System.nanoTime();
        input = input.replaceAll("-", "");
        long endTime = System.nanoTime();
        System.out.println(input + ": replaceAll");
        long result = endTime - startTime;
        return result;
    }

    public static long testStringBuilder(String input) {
        long startTime = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        builder.append(input.substring(0, 8)).append(input.substring(9, 13)).append(input.substring(14, 18)).append(input.substring(19, 23))
                .append(input.substring(24));
        input = builder.toString();
        long endTime = System.nanoTime();
        System.out.println(input + ": Builder");
        long result = endTime - startTime;
        return result;
    }

    public static long testGuavaCharMatcher(String input) {
        long startTime = System.nanoTime();
        input = CharMatcher.is('-').removeFrom(input);
        long endTime = System.nanoTime();
        System.out.println(input + ": CharMatcher");
        long result = endTime - startTime;
        return result;
    }

}
