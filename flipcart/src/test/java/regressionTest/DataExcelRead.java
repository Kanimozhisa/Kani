package regressionTest;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pageObject.Utilits2;

public class DataExcelRead extends Utilits2 {
	public static ExtentTest test;
	@Test
	public void fileread() throws IOException, InvalidFormatException
	{
		
		test = report.createTest("logintestcaseresults");
		
		File file=new File ("C:\\Users\\CARE\\Desktop\\test2.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rowcount =sheet.getLastRowNum();	
		int colcount=sheet.getRow(0).getLastCellNum();	
		for(int i=0;i<=rowcount;i++)
		{
			XSSFRow celldata=sheet.getRow(i);
			String username=celldata.getCell(0).getStringCellValue();
			String pwd=celldata.getCell(1).getStringCellValue();
			
			driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
			List<WebElement> l= driver.findElements(By.xpath("//li//a[@class='oxd-userdropdown-link']"));
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			for(WebElement item : l)
			{
				if(item.getText().equalsIgnoreCase("Logout"))
				{
					item.click();
					test.log(Status.PASS, "Login test case passed");
					break;
				}
				else
				{
					System.out.println("Not found");
					test.log(Status.FAIL, "Login test case failed");
				}
			}
			//driver.close();
			
		}
}
}
