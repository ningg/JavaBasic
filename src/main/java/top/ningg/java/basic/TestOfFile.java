package top.ningg.java.basic;

import java.io.File;

import org.apache.commons.io.FilenameUtils;

public class TestOfFile {

    public static void main(String[] args) {
        File file = new File("/haha/test/sdhfas/ss.txt");
        String filename = file.getName();
        String extensionName = FilenameUtils.getExtension(filename);
        System.out.println(extensionName);
    }
}
