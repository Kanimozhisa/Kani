package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utilits3 {

public static ExtentReports report;
	public static ExtentSparkReporter spark;
	
	public static void startTest()
	{

	spark = new ExtentSparkReporter("C:\\Users\\CARE\\Desktop\\Selenium\\flipcart\\output\\extentreport2.html");
	report = new ExtentReports();
	report.attachReporter(spark);
	}
	
	public static void flushReport()
	{
		report.flush();
	}

}
