package top.ningg.java.github;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.List;

import top.ningg.java.github.service.IBlogDealService;
import top.ningg.java.github.service.impl.BlogDealServiceImpl;

import com.google.common.collect.Lists;

public class BlogMain {

    public static void main(String[] args) throws IOException {
        IBlogDealService blogDealService = new BlogDealServiceImpl();

        // 遍历所有 md 文件, 并逐个处理:
        String srcDir = "/Users/guoning/ningg/github/ningg.github.com/_posts/blog";
        String destDir = "/Users/guoning/ningg/github/ningg.github.com/_posts/blog_bak";

        // destDir 存在时删除, 然后自动创建
        File destDirFile = new File(destDir);
        if (destDirFile.exists()) {
            destDirFile.deleteOnExit();
            destDirFile.delete();
        }
        destDirFile.mkdir();

        // 遍历 srcDir 目录下所有 md 文件
        File sourceDir = new File(srcDir);
        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile() && pathname.getName().contains(".md");
            }
        };
        List<File> sourceFile = Lists.newArrayList(sourceDir.listFiles(fileFilter));

        for (File single : sourceFile) {
            // 复制文件, 并且替换指定字符串
            String singleName = single.getName();
            File destFile = new File(destDir + File.separator + singleName);
            if (!destFile.exists()) {
                destFile.createNewFile();
            }

            // 真正的处理.
            // blogDealService.caseConvertOfCategory(single, destFile);
            blogDealService.publishAllBlog(single, destFile);
        }
    }
}
