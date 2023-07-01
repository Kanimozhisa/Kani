package regressionTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.LoginObject;
import pageObject.Utilits;
//import Objects.ExtentReportObjects;

public class LoginTestcase extends Utilits {
	//public static WebDriver driver;
	public static ExtentTest test;
	@Test
	public void Login() {
	test = report.createTest("logintestcaseresults");
		/*
		 * WebDriverManager.firefoxdriver().setup(); driver = new FirefoxDriver();
		 * driver.get("https://www.google.com");
		 */
		PageFactory.initElements(driver,LoginObject.class);
		LoginObject.dropvalue.sendKeys("Testing");
		PageFactory.initElements(driver,Utilits.class);
		//driver.findElement(By.id("APjFqb")).sendKeys("Testing");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement> l= driver.findElements(By.xpath("//div[@class='erkvQe']/div[1]/ul/li/div/div[2]/div[1]/div[1]/span[1]"));
		System.out.println("size of Autosuggestion "+l.size());
		for(WebElement item : l)
		{
			if(item.getText().equalsIgnoreCase("Testing"))
			{
				item.click();
				System.out.println("Sucessfull");
				test.log(Status.PASS, "Login test case passed");
				break;
			}
			else
			{
				System.out.println("Not found");
				test.log(Status.FAIL, "Login test case failed");
			}
		}
		
		


	}

}

