package top.ningg.java.exception;

import org.apache.commons.lang3.StringUtils;

public class TestCheckedExceptionService {

    private void checkedException() throws TestCheckedException {
        throw new TestCheckedException("HAHA");
    }

    private void uncheckedException(String msg) {
        if (StringUtils.isBlank(msg)) {
            throw new TestUncheckedException();
        } else {
            throw new TestUncheckedException("haha");
        }
    }

    public static void main(String[] args) {
        TestCheckedExceptionService testCheckedExceptionService = new TestCheckedExceptionService();
        testCheckedExceptionService.uncheckedException("null");
    }
}
