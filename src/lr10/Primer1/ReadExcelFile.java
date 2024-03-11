package lr10.Primer1;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadExcelFile {
    public static void main(String[] args) throws IOException {
        String filePath = "src/lr10/Primer1/example3.xlsx";
        FileInputStream inputStream = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheet("Товары");
        for (Row row : sheet)
        {
            for (Cell cell : row)
            {
                System.out.print(cell.toString() + "\t");
            }
            System.out.println();
        }
        workbook.close();
        inputStream.close();
    }
}
