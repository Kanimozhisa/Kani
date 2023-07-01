package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utilits2 {
	public static WebDriver driver;
	@BeforeTest
	public void openBrowser()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
	}
	
	public static ExtentReports report;
	public static ExtentSparkReporter spark;
	@BeforeClass
	public static void startTest()
	{

	spark = new ExtentSparkReporter("C:\\Users\\CARE\\Desktop\\Selenium\\flipcart\\output\\extentreport1.html");
	report = new ExtentReports();
	report.attachReporter(spark);
	}
	@AfterClass
	public static void flushReport()
	{
		report.flush();
	}
}


