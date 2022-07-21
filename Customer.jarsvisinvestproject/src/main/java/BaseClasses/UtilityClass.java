package BaseClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass {
	public static String ReadExceldata(int row,int column) throws EncryptedDocumentException, IOException
	{
File sc=new File("C:\\Users\\HP\\eclipse-workspace\\Customer.jarsvisinvestproject\\Exceldata\\Data.xlsx");
	FileInputStream file=new FileInputStream(sc);
	Sheet mysheet = WorkbookFactory.create(file).getSheet("Sheet1");
	 String value=mysheet.getRow(row).getCell(column).getStringCellValue();
	return value;

}
}
