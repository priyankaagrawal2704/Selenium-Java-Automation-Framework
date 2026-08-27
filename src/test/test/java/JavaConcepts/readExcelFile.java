package JavaConcepts;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class readExcelFile {
    public static void main(String[] args) throws Exception{
        String path = System.getProperty("user.dir");
        File file = new File(path+"\\src\\test\\java\\JavaConcepts\\sample.xlsx");
        FileInputStream fis = new FileInputStream(file);
        /*
        HSSF Workbook - Horrible Spread Sheet Format - .xls
        XSSF Workbook - XML Spread Sheet Format - .xlsx
         */
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
//        XSSFSheet sheet = workbook.getSheetAt(0); //refers the first sheet
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        System.out.println(workbook.getNumberOfSheets());
        System.out.println(workbook.getActiveSheetIndex());

        XSSFRow row = sheet.getRow(0);
        System.out.println(row.getCell(0));
        System.out.println(sheet.getLastRowNum());
        System.out.println(row.getLastCellNum());
    }
}
