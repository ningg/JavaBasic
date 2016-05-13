package top.ningg.java.github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.util.StringUtils;

/**
 * Created by guoning on 16/4/3.
 */
public class BlankSpaceOfMarkdown {

    private static final List<String> HEAD_KEY = ImmutableList.of("#", "##", "###", "####", "#####");
    private static final Map<String, String> HEAD_MAP = Maps.toMap(HEAD_KEY, new Function<String, String>() {
        @Override
        public String apply(String input) {
            // 要求: 后面不能为空格和#
            return String.format("^(%s)[^#\\s]", input);
        }
    });

    public static void main(String[] args) throws IOException {
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
            copyAndFilterMDFile(single, destFile);
        }

    }

    private static void copyAndFilterMDFile(File fromFile, File toFile) throws IOException {
        System.out.println(String.format("From File: %s, To File: %s", fromFile.getName(), toFile.getName()));

        FileReader fromFileReader = new FileReader(fromFile);
        FileWriter toFileWriter = new FileWriter(toFile);

        BufferedReader fromBufferedReader = new BufferedReader(fromFileReader);
        BufferedWriter toBufferedWriter = new BufferedWriter(toFileWriter);

        String fromLine = fromBufferedReader.readLine();
        while (null != fromLine) {
            String toLine = fromLine;
            for (String singleHead : HEAD_MAP.keySet()) {
                Pattern head_one_pattern = Pattern.compile(HEAD_MAP.get(singleHead));
                Matcher matcher = head_one_pattern.matcher(fromLine);
                if (matcher.find()) {
                    toLine = StringUtils.replace(toLine, matcher.group(1), singleHead + " ");
                }
            }
            toBufferedWriter.append(toLine);
            toBufferedWriter.newLine();
            toBufferedWriter.flush();
            fromLine = fromBufferedReader.readLine();
        }
        fromBufferedReader.close();
        toBufferedWriter.close();

    }
}
