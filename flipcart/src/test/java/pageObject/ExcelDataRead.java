package pageObject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.WebDriver;

public class ExcelDataRead {

	public static void main(String[] args) throws IOException
	{
		
		String path ="C:\\Users\\CARE\\Desktop\\Selenium\\flipcart\\src\\test\\resources\\Kanimozhi.xlsx\\";
		FileInputStream fi=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(fi);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(1).getLastCellNum();
		for(int r=0;r<=rows;r++)
		{
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell=row.getCell(c);
				System.out.println(cell.getStringCellValue());
				switch(cell.getCellType())
				{
				case STRING: System.out.println(cell.getStringCellValue()); break;
				case NUMERIC: System.out.println(cell.getNumericCellValue()); break;
				}
			}
		}
		
	}
}
