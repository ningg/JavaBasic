package top.ningg.java.github.service;

import java.io.File;

public interface IBlogDealService {

    /**
     * 规范 Category 中类别, 例如: java --> Java, linux --> Linux
     */
    void caseConvertOfCategory(File fromFile, File toFile);

    /**
     * 在 #\##\###等 HEADER 的标识后, 添加一个空格.
     */
    void dealHeaderOfMD(File fromFile, File toFile);

    /**
     * publish all blog, 将所有的 blog 都 publish.
     */
    void publishAllBlog(File fromFile, File toFile);
}
