package top.ningg.java.poi;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 读写 word\excel 等文档.
 */
public class ApachePOITest {

    public static void main(String[] args) throws IOException, InvalidFormatException {
        String filename = "201819_user.xlsx";
        String realFilename = ApachePOITest.class.getClassLoader().getResource(filename).getFile();
        File inputFile = new File(realFilename);
        // Use an InputStream, needs more memory
        Workbook wb = WorkbookFactory.create(new FileInputStream(inputFile));

        for (Sheet sheet : wb ) {
            for (Row row : sheet) {
                System.out.println(row);
            }
        }

        wb.close();
    }


}
