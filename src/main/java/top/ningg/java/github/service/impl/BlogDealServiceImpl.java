package top.ningg.java.github.service.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.util.StringUtils;

import top.ningg.java.github.service.IBlogDealService;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

public class BlogDealServiceImpl implements IBlogDealService {

    // 处理 category 时使用.
    private static final Map<String, String> CASE_CONVERT_MAP = ImmutableMap.<String, String> builder().put("java", "java").put("linux", "linux")
            .put("tomcat", "tomcat").put("mysql", "mysql").put("flume", "flume").put("jvm", "jvm").put("jsp", "jsp").put("git", "git").build();

    private static final String CATEGORY_PATTERN = "^(category:)";
    private static final String CATEGORIES_PATTERN = "^(categories:)";

    // 处理标题时使用.
    private static final List<String> HEAD_KEY = ImmutableList.of("#", "##", "###", "####", "#####");
    private static final Map<String, String> HEAD_MAP = Maps.toMap(HEAD_KEY, new Function<String, String>() {
        @Override
        public String apply(String input) {
            // 要求: 后面不能为空格和#
            return String.format("^(%s)[^#\\s]", input);
        }
    });

    // publish 所有 blog 时使用.
    private static final String PUBLISH_PATTERN = "^published:";

    @Override
    public void caseConvertOfCategory(File fromFile, File toFile) {

        System.out.println(String.format("From File: %s, To File: %s", fromFile.getName(), toFile.getName()));

        try {
            FileReader fromFileReader = null;

            fromFileReader = new FileReader(fromFile);

            FileWriter toFileWriter = new FileWriter(toFile);

            BufferedReader fromBufferedReader = new BufferedReader(fromFileReader);
            BufferedWriter toBufferedWriter = new BufferedWriter(toFileWriter);

            String fromLine = fromBufferedReader.readLine();
            while (null != fromLine) {
                String toLine = fromLine;

                // category 匹配
                Pattern categoryPattern = Pattern.compile(CATEGORY_PATTERN);
                Matcher categoryMatcher = categoryPattern.matcher(fromLine);

                // categories 匹配
                Pattern categoriesPattern = Pattern.compile(CATEGORIES_PATTERN);
                Matcher categoriesMatcher = categoriesPattern.matcher(fromLine);

                // 将所有的 category 都转换为小写字母.
                if (categoryMatcher.find() || categoriesMatcher.find()) {
                    toLine = toLine.toLowerCase();
                }
                toBufferedWriter.append(toLine);
                toBufferedWriter.newLine();
                toBufferedWriter.flush();
                fromLine = fromBufferedReader.readLine();
            }
            fromBufferedReader.close();
            toBufferedWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void dealHeaderOfMD(File fromFile, File toFile) {

        System.out.println(String.format("From File: %s, To File: %s", fromFile.getName(), toFile.getName()));

        try {
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

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void publishAllBlog(File fromFile, File toFile) {

        System.out.println(String.format("From File: %s, To File: %s", fromFile.getName(), toFile.getName()));

        try {
            FileReader fromFileReader = null;

            fromFileReader = new FileReader(fromFile);

            FileWriter toFileWriter = new FileWriter(toFile);

            BufferedReader fromBufferedReader = new BufferedReader(fromFileReader);
            BufferedWriter toBufferedWriter = new BufferedWriter(toFileWriter);

            String fromLine = fromBufferedReader.readLine();
            while (null != fromLine) {
                String toLine = fromLine;

                // publish 匹配
                Pattern publishPattern = Pattern.compile(PUBLISH_PATTERN);
                Matcher publishMatcher = publishPattern.matcher(fromLine);

                // 将所有的 publish 都转换为小写字母.
                if (publishMatcher.find()) {
                    toLine = toLine.replaceAll("false", "true");
                }
                toBufferedWriter.append(toLine);
                toBufferedWriter.newLine();
                toBufferedWriter.flush();
                fromLine = fromBufferedReader.readLine();
            }
            fromBufferedReader.close();
            toBufferedWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
