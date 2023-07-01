package pageObject;
import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.apache.poi.xssf.usermodel.XSSFRow;
public class ExcelRead {

	public static WebDriver driver;
	@Test
	public void fileread() throws IOException
	{
		
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		File file=new File ("C:\\Users\\CARE\\Desktop\\test.xlsx");
		FileInputStream fi=new FileInputStream(file);
		XSSFWorkbook workbook= new XSSFWorkbook(fi);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rowcount =sheet.getLastRowNum();	
		int colcount=sheet.getRow(0).getLastCellNum();	
for(int r=0;r<=rowcount;r++)
{
	XSSFRow celldata=sheet.getRow(r);
	String username=celldata.getCell(0).getStringCellValue();
	String pwd=celldata.getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
}
FileOutputStream fo=new FileOutputStream(file);
sheet.getRow(0).createCell(2).setCellValue("Passed");
workbook.write(fo);
fo.close();

		
	}
}
