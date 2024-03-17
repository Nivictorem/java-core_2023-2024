package lr10.Task4;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EXCELParser {
    public static void main(String[] args) throws IOException {
        String filePath = "src/lr10/Primer1/example3.xlsx";
        try {
            FileInputStream inputStream = new FileInputStream(filePath);
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheet("Товары");
            if(sheet == null)
            {
                System.out.println("Листа с таким именем не существует, проверьте наименование листа и перезапустите программу");
                return;
            }
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
        catch (FileNotFoundException fileNotFoundException)
        {
            System.out.println("Полное имя файла: " + filePath + "\n" + "И такой файл не был найден, " +
                    "скорее всего он не корректен, прошу перезадать его");
        }
        catch (IOException ioException)
        {
            System.out.println("Нарушен процесс ввода вывода, возможно расширение файла не корректное");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
