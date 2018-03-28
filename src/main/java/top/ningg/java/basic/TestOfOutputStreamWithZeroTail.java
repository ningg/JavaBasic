package top.ningg.java.basic;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;

/**
 * 测试数据流, 关注最后的乱码(\0 填充符)
 */
public class TestOfOutputStreamWithZeroTail {

    public static final List<String> INPUT_TEMP_LIST = new LinkedList<>();

    static {
        INPUT_TEMP_LIST.add("哈哈asdfasdfa哈");
        INPUT_TEMP_LIST.add("好啊好啊好啊好啊好啊");
        INPUT_TEMP_LIST.add("哈好啊好啊好啊好啊哈哈");
        INPUT_TEMP_LIST.add("哈哈1241241241 好啊好啊好啊好啊哈");
        INPUT_TEMP_LIST.add("哈好啊好啊好啊好啊好啊好啊好啊好啊哈哈");
    }


    public static void main(String[] args) throws IOException {

        String baseFilePath = "/Users/guoning/ningg/github/JavaBasic/";
        String srcFile = baseFilePath + "refundfinance_20180201182349_number2_money598.csv";
        String destFile = baseFilePath + "output.log";
        String charset = "GBK";

        FileInputStream fileInputStream = new FileInputStream(srcFile);
        FileOutputStream fileOutputStream = new FileOutputStream(destFile);

        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, charset);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, charset);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        StringBuilder inputLineBuilder = new StringBuilder();

        String inputLine = null;

        while((inputLine = bufferedReader.readLine()) != null ){
            // inputLine = StringUtils.trim(inputLine);
            bufferedWriter.write(inputLine);
            bufferedWriter.newLine();
            System.out.println(inputLine);
        }

        // 多行输出
        /*for (int index = 0; index < 100; index++) {
            int random = (int) (Math.random() * 10) % INPUT_TEMP_LIST.size();
            inputLineBuilder.append(INPUT_TEMP_LIST.get(random));
            inputLineBuilder.append("\n");
        }*/

        bufferedWriter.write(inputLineBuilder.toString());

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

        fileOutputStream.flush();
        fileOutputStream.close();
        fileInputStream.close();
    }


}
