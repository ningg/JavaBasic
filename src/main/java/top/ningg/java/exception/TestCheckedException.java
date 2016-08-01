package top.ningg.java.exception;

/**
 * Created by guoning on 16/5/27.
 */
public class TestCheckedException extends Exception {

    private static final long serialVersionUID = 2325676760258975664L;

    public static final String TEMPLATE = "测试受检异常, 详细信息: %s";

    public TestCheckedException() {
        super();
    }

    public TestCheckedException(String message) {
        super(String.format(TEMPLATE, message));
    }
}
