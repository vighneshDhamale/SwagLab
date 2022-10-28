package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization  {
public static String getExcelData(int row,int cell,String sheetName) throws EncryptedDocumentException, IOException {
		
		FileInputStream File= new FileInputStream("D:\\.metadata\\.plugins\\SwagLab\\src\\main\\resources\\New Microsoft Office Excel Worksheet.xlsx");
		String value=WorkbookFactory.create(File).getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		
		return value;


}
}
