package top.ningg.java.exception;

public class TestUncheckedException extends RuntimeException {

    private static final long serialVersionUID = 2325676760258975664L;

    public static final String TEMPLATE = "测试受检异常, 详细信息: %s";

    public TestUncheckedException() {
        super();
    }

    public TestUncheckedException(String message) {
        // super(String.format(TEMPLATE, message));
    }
}
